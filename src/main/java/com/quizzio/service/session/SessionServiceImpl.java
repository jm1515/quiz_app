package com.quizzio.service.session;

import com.quizzio.model.entities.Question;
import com.quizzio.model.entities.Response;
import com.quizzio.model.entities.User;
import com.quizzio.service.question.QuestionServiceImpl;
import com.quizzio.service.question.QuestionThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.*;

@Service
public class SessionServiceImpl implements SessionService {
    //La liste des utilisateurs présents dans la session en cours
    private HashMap<WebSocketSession, User> userList;
    //Le classement
    private List<User> leaderboard;
    //La liste des questions de la session en cours
    private List<Question> questionList;
    //Est-ce que la session a déja été lancée ou non
    private boolean isRunning = false;
    //La position de la question en cours
    private static int CURRENT_QUESTION = 0;
    private QuestionThread qt;
    @Autowired
    private QuestionServiceImpl questionService;

    @Override
    public void initiateSession() {
        this.userList = new HashMap<>();
        this.questionList = questionService.getAllQuestions();
        qt = new QuestionThread(this);
    }

    @Override
    public void joinSession(User user, WebSocketSession wss) {
        verifyUsername(user);
        userList.put(wss, user);
        if (!isRunning){
            Thread game = new Thread(qt.resume());
            game.start();
            isRunning = true;
        }
        //actualiser la liste sur le client
    }

    //verifie si le pseudo est déja utilisé et rajoute un "1" si oui
    private void verifyUsername(User user){
        if(userList.containsValue(user)){
            user.setUsername(user.getUsername()+"1");
            verifyUsername(user);
        }
    }

    @Override
    public HashMap<WebSocketSession, User> getUsers() {
        return this.userList;
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public void sendNextQuestion() throws IOException {
        Question currentQuest;
        String message;
        try {
            currentQuest = questionList.get(CURRENT_QUESTION);
            System.out.println("sending question n°" + CURRENT_QUESTION);
            CURRENT_QUESTION++;
            message = "quest;" + currentQuest.getIntituleQuest() + ";";
            int correctIndex = 0;
            for (int  i= 0; i < currentQuest.getResp().size(); i++){
                Response r = currentQuest.getResp().get(i);
                message += r.getIntituleResp() + ";";
                if(r.isGoodRep()){
                    correctIndex = i+1;
                }
            }
            message += correctIndex + ";"+CURRENT_QUESTION;
        } catch(IndexOutOfBoundsException e){
            message = "end";
            finishSession();
        }
        for (WebSocketSession ws : userList.keySet()){
            synchronized (ws) {
                ws.sendMessage(new TextMessage(message));
            }
        }
    }

    @Override
    public User getUser(WebSocketSession webSocketSession) {
        return userList.get(webSocketSession);
    }

    @Override
    public void updateRanking() throws IOException {
        String ranking = "ranks:";
        leaderboard = new ArrayList<>(userList.values());
        tri_bulles(leaderboard);
        for (User u : leaderboard){
            ranking += u.getUsername() + " " + u.getPoint() +":";
        }
        System.out.println(ranking);
        for (WebSocketSession ws : userList.keySet()){
            synchronized (ws) {
                try {
                    ws.sendMessage(new TextMessage(ranking));
                }catch (IllegalStateException e){
                    removeUser(ws);
                }
            }
        }
    }

    private void tri_bulles(List<User> leaderboard){
        boolean tab_en_ordre = false;
        int taille = leaderboard.size();
        while(!tab_en_ordre) {
            tab_en_ordre = true;
            for(int i=0 ; i < taille-1 ; i++) {
                if(leaderboard.get(i).getPoint() < leaderboard.get(i+1).getPoint()){
                    User tmp = leaderboard.get(i);
                    leaderboard.set(i,leaderboard.get(i+1));
                    leaderboard.set(i+1, tmp);
                    tab_en_ordre = false;
                }
            }
            taille--;
        }
    }

    @Override
    public void removeUser(WebSocketSession webSocketSession) {
            userList.remove(webSocketSession);
        try {
            updateRanking();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getLeaderboard() {
        return this.leaderboard;
    }

    @Override
    public void finishSession() {
        qt.stop();
        isRunning = false;
        CURRENT_QUESTION = 0;
    }
}

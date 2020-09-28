package com.quizzio.service.session;

import com.quizzio.model.entities.Question;
import com.quizzio.model.entities.User;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface SessionService {
    void initiateSession();
    void joinSession(User user, WebSocketSession wss);
    HashMap<WebSocketSession, User> getUsers();
    boolean isRunning();
    void sendNextQuestion() throws IOException;
    User getUser(WebSocketSession webSocketSession);
    void updateRanking() throws IOException;
    void removeUser(WebSocketSession webSocketSession);
    List<User> getLeaderboard();

    void finishSession();
}

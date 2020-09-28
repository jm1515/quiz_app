package com.quizzio.controller.websocket;

import com.quizzio.service.session.SessionService;
import com.quizzio.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 * Handler for WebSocket
 * **/
@Component
public class UserResponseWebSocket extends TextWebSocketHandler {

    @Autowired
    SessionService sessionService;
    @Autowired
    UserService userService;

    @Override
    public void handleTextMessage(final WebSocketSession webSocketSession, final TextMessage webSocketMessage){
        String request  = webSocketMessage.getPayload();
        if (request.startsWith("name")){
            String username = request.split(" ")[1];
            sessionService.joinSession(userService.createUser(username), webSocketSession);
            try {
                sessionService.updateRanking();
                if (sessionService.getUsers().size() > 1) {
                    webSocketSession.sendMessage(new TextMessage("wait"));
                }
            } catch (IOException e) {
              e.printStackTrace();
            }
            return;
        }
        if (request.startsWith("correct")){
            int time = Integer.valueOf(request.split(" ")[1]);
            int point = time + 10;
            sessionService.getUser(webSocketSession).addPoint(point);
            try {
                sessionService.updateRanking();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        System.out.println("response : " + webSocketMessage.getPayload());
        //compter les points
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status){
        sessionService.removeUser(session);
    }
}

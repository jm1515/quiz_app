package com.quizzio.controller.Test;


import com.quizzio.model.entities.User;
import com.quizzio.service.session.SessionService;
import com.quizzio.service.session.SessionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.adapter.standard.StandardWebSocketSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JUnit_Test {

    @Test
    public final void testJoinSession() {
        User u = new User("Test", 0);
        SessionService ss = new SessionServiceImpl();
        ss.joinSession(u, null);
        User test = ss.getUsers().get(u);
        ss.finishSession();
        assertEquals(test,u);
    }

    @Test
    public final void testJoinSessionSamePseudo() {
        User u = new User("Test", 0);
        User n = new User("Test", 0);
        SessionService ss = new SessionServiceImpl();
        ss.joinSession(u, null);
        User test = ss.getUsers().get(n);
        ss.finishSession();
        assertEquals(test.getUsername(),n.getUsername()+"1");

    }

    @Test final void testSessionRunning(){
        User u = new User("Test", 0);
        SessionService ss = new SessionServiceImpl();
        ss.joinSession(u, null);
        assertEquals(ss.isRunning(), true);
        ss.finishSession();
        assertEquals(ss.isRunning(), false);
    }

    @Test final void testRanking(){
        User u = new User("Test", 0);
        User n = new User("Test2", 50);
        SessionService ss = new SessionServiceImpl();
        ss.joinSession(u, null);
        ss.joinSession(n, null);
        try {
            ss.updateRanking();
        } catch (IOException e) {
            e.printStackTrace();
            fail("IOException");
        }
        ss.finishSession();
        assertEquals(ss.getLeaderboard().get(0), n);
    }
}

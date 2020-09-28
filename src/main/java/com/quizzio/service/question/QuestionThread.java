package com.quizzio.service.question;

import com.quizzio.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class QuestionThread implements Runnable {

    private SessionService sessionService;
    private boolean isrunning = true;

    public QuestionThread (SessionService sessionService){
        this.sessionService = sessionService;
    }

    public synchronized void stop(){
        isrunning = false;
    }

    public synchronized QuestionThread resume(){
        isrunning = true;
        return this;
    }

    @Override
    public void run() {
        while (isrunning){
            try {
                sessionService.sendNextQuestion();
                Thread.sleep(21000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

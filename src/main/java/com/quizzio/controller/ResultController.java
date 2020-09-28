package com.quizzio.controller;

import com.quizzio.service.session.SessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
* Controller used for the final ranking
* */
@Controller
public class ResultController{

    @Autowired
    private SessionServiceImpl sessionService;

    @RequestMapping("/leaderboard")
    private ModelAndView logUser(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("sessionResults", sessionService.getLeaderboard());
        mav.setViewName("ranking");
        return mav;
    }
}

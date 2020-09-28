package com.quizzio.controller;

import com.quizzio.service.session.SessionService;
import com.quizzio.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cloarec1 on 09/01/2018.
 */

/**
 * Recuperation du nom d'utilisateur et creation d'une session
 * Ajout de l'utilisateur a la session
 * Renvoie du nom de l'utilisateur a la vue
 * Redirection vers la vue des questions
 */

@Controller
public class LoginController{

    @Autowired
    private SessionService sessionService;

    @RequestMapping("/login")
    private ModelAndView logUser(@RequestParam String username){
        if (!sessionService.isRunning()){
            this.sessionService.initiateSession();
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("username", username);
        mav.setViewName("session");
        return mav;
    }
}

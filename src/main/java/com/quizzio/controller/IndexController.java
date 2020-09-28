package com.quizzio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller using for the redirection of user
 * */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String test() {
        return "indexPage";
    }
}

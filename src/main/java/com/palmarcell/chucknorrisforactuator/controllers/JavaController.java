package com.palmarcell.chucknorrisforactuator.controllers;

import com.palmarcell.chucknorrisforactuator.serivces.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gemboly on 2018. 06. 13., 2018
 */
@Controller
public class JavaController {

    private JokeService jokeService;

    @Autowired
    public JavaController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}

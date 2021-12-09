package com.demologging.spring_demologging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/Home")
    public String home(){
        logger.trace("what to do praveen");
        return "Hello welcome to my home page";
    }
}

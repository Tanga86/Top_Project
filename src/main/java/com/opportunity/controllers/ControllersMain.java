package com.opportunity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class ControllersMain {
    @RequestMapping("/")
    public String main(){
        return "main";
    }

}

package com.opportunity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/booking")
public class ContollersBooking {
   @RequestMapping("/")
    public String main(){
        return "booking";
    }

}

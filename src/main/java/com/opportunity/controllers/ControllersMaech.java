package com.opportunity.controllers;

import com.opportunity.dto.Mechanic;
import com.opportunity.service.MachanicServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mech")
public class ControllersMaech {
    @Autowired
    private MachanicServise machanicServise;


    @RequestMapping("/")
    public String main(){
        return "mech";
    }//Должен соответствовать названю jsp страницы

    @RequestMapping("/getall")
    @ResponseBody//
    public List<Mechanic> getAll(){
        return machanicServise.getAll();
    }
}

package com.opportunity.controllers;

import com.opportunity.dao.CarDao;
import com.opportunity.dao.MechanicDao;
import com.opportunity.dto.Car;
import com.opportunity.dto.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")///////////
public class ControllersTwo {
    @RequestMapping("/")
    public String main() {
        return "car";
//    @Autowired//////////////
//    private CarDao carDao;
//
//    @RequestMapping("/")
//    public void test(){
//        System.out.println("CAR");
//        List<Car> all=carDao.getAll();
//        System.out.println(all);
//    }


    }
}

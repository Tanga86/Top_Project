package com.opportunity.controllers;



import com.opportunity.dao.MechanicDao;
import com.opportunity.dto.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mech")///////////адрес перехода
public class Controllers {
    @RequestMapping("/")
    public String main() {
        return "WEB-INF/views/mech.jsp";
//    @Autowired//////////////
//    private MechanicDao mechanicDao;
//
//    @RequestMapping("/")
//    public void test(){
//        System.out.println("MECHANIC");
//        List<Mechanic> all=mechanicDao.getAll();
//        System.out.println(all);
//    }


    }
}
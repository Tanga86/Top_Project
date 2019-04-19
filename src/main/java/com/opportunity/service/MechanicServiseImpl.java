package com.opportunity.service;

import com.opportunity.dao.MechanicDao;
import com.opportunity.dto.Mechanic;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MechanicServiseImpl implements MachanicServise {
    @Autowired
    private MechanicDao mechanicDao;

    public List<Mechanic> getAll() {
        List<Mechanic> allMex = mechanicDao.getAll();
//        List<Mechanic> expa = new ArrayList<Mechanic>();
//        for (Mechanic mechanic : allMex) {
//            if (mechanic.getExperience() > 5)
//                expa.add(mechanic);
//            return expa;
//        }
        return mechanicDao.getAll();
    }
}

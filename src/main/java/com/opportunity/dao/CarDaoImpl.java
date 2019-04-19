package com.opportunity.dao;

import com.opportunity.dto.Car;
import com.opportunity.dto.Mechanic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Car> getAll() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Car> list = session.createCriteria(Car.class).list();
        tx.commit();
        session.close();
        return list;


    }

}


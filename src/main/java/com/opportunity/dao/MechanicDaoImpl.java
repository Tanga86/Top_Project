package com.opportunity.dao;

import com.opportunity.dto.Mechanic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MechanicDaoImpl implements MechanicDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Mechanic> getAll() {
        List<Mechanic> list=sessionFactory
                .getCurrentSession()
                .createCriteria(Mechanic.class).list();;
                return list;

 //   public List<Mechanic> getAll() {
//        Session session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
//        List<Mechanic> list = session.createCriteria(Mechanic.class).list();
//        tx.commit();
//        session.close();
//        return list;


    }

}


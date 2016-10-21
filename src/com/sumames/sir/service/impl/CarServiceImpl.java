/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.service.impl;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.service.CarService;
import com.sumames.sir.service.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Asus
 */
public class CarServiceImpl implements CarService {

    Transaction tx = null;

    public Session getSession() {
        Session session = HibernateUtil.getInstance().getCurrentSession();
        try {
            tx = session.beginTransaction();
        } catch (HibernateException e) {
            if (tx != null) {
                try {
                    tx.rollback();
                } catch (Exception re) {
                    System.err.println("Error when trying to rollback transaction:"); // use logging framework here
                    re.printStackTrace();
                }
            }
            System.err.println("Original error when executing query:"); // // use logging framework here
            e.printStackTrace();
        }
        return session;
    }

    public Session session() {
        return HibernateUtil.getInstance().getCurrentSession();
    }

    public void sessionClear() {
        HibernateUtil.getInstance().getCurrentSession().clear();
    }

    @Override
    public boolean save(Object obj) {
        getSession().saveOrUpdate(obj);
        tx.commit();
        return true;
    }

    @Override
    public boolean delete(Object obj) {
        getSession().delete(obj);
        tx.commit();
        return true;
    }

    @Override
    public List<Car> getCarAll() {
        List<Car> list = getSession().createQuery("from Car a").list();
        try {
            tx.commit();
        } catch (Exception ex) {
            // Log the exception here
            tx.rollback();
            throw ex;
        } finally {
            HibernateUtil.close();
        }
        return list;
    }

    @Override
    public Car getById(int id) {
//        return (Customer) getSession()
//                .createQuery("from Customer a where a.record_id=:id")
//                .setParameter("id", id)
//                .uniqueResult();
        Car car = (Car) getSession().load(Car.class, id);
        tx.commit();
        return car;
    }

    @Override
    public List<Car> getByGarageId(int id) {
        List<Car> list = getSession().createQuery("from Car where car_garage_record_id=:id")
                .setParameter("id", id).list();
//        return (Customer) getSession()
//                .createQuery("from Customer a where a.record_id=:id")
//                .setParameter("id", id)
//                .uniqueResult();
        return list;
    }
}

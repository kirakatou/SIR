/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.service.impl;

import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.service.AccessService;
import com.sumames.sir.service.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Asus
 */
public class AccessServiceImpl implements AccessService{

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
        try {
            tx.commit();
        } catch (Exception ex) {
            // Log the exception here
            tx.rollback();
            throw ex;
        } finally {
            HibernateUtil.close();
        }
        return true;
    }

    @Override
    public boolean delete(Object obj) { 
        getSession().delete(obj);
        tx.commit();
        return true;
    }

    @Override
    public List<LoginAccess> getAccessAll() {
        List<LoginAccess> list = getSession().createQuery("from LoginAccess a").list();
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

  

    
}

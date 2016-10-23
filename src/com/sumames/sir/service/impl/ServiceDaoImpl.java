package com.sumames.sir.service.impl;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.service.ServiceDao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sutandi
 */
@Service("serviceDao")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(readOnly = false)
    public boolean save(Object obj) {
        getCurrentSession().saveOrUpdate(obj);
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(Object obj) {
        getCurrentSession().delete(obj);
        return true;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Customer t = (Customer) getCurrentSession().get(Customer.class, id);
        return t;
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> list = getCurrentSession().createQuery("FROM Customer a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<Customer> getCustomersDeleted() {
        List<Customer> list = getCurrentSession().createQuery("FROM Customer a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Car getCarById(Integer id) {
        Car t = (Car) getCurrentSession().get(Car.class, id);
        return t;
    }

    @Override
    public List<Car> getListCarById(int id) {
        List<Car> list = getCurrentSession().createQuery("from Car where car_garage_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public List<Car> getCars() {
        List<Car> list = getCurrentSession().createQuery("FROM Customer a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Employer getEmployerById(Integer id) {
        Employer t = (Employer) getCurrentSession().get(Employer.class, id);
        return t;
    }

    @Override
    public List<Employer> getEmployers() {
        List<Employer> list = getCurrentSession().createQuery("FROM Employer a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Garage getGarageById(Integer id) {
        Garage t = (Garage) getCurrentSession().get(Garage.class, id);
        return t;
    }

    @Override
    public List<Garage> getGarages() {
        List<Garage> list = getCurrentSession().createQuery("FROM Garage a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Login getLoginById(Integer id) {
        Login t = (Login) getCurrentSession().get(Login.class, id);
        return t;
    }

    @Override
    public List<Login> getLogins() {
        List<Login> list = getCurrentSession().createQuery("FROM Login a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Login getByUsername(String username) {
        Login login = (Login) getCurrentSession().createQuery("from Login where username=:userName")
                .setParameter("userName", username)
                .uniqueResult();
        return login;
    }

    @Override
    public LoginAccess getAccessById(Integer id) {
        LoginAccess t = (LoginAccess) getCurrentSession().get(LoginAccess.class, id);
        return t;
    }

    @Override
    public List<LoginAccess> getAccesses() {
        List<LoginAccess> list = getCurrentSession().createQuery("FROM LoginAccess a ORDER BY a.recordId ASC").list();
        return list;
    }

}

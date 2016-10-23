package com.sumames.sir.service;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import java.util.List;

/**
 *
 * @author Sutandi
 */
public interface ServiceDao {
    
    public boolean save(Object obj);        

    public boolean delete(Object obj);
    
    public Customer getCustomerById(Integer id);
    
    public List<Customer> getCustomers();           
    
    public Car getCarById(Integer id);
    
    public List<Car> getListCarById(int id);
    
    public List<Car> getCars(); 
    
    public Employer getEmployerById(Integer id);
    
    public List<Employer> getEmployers();           
    
    public Garage getGarageById(Integer id);
    
    public List<Garage> getGarages();
    
    public Login getLoginById(Integer id);
    
    public List<Login> getLogins();
    
    public Login getByUsername(String username);
    
    public LoginAccess getAccessById(Integer id);
    
    public List<LoginAccess> getAccesses();

    
    
    
}

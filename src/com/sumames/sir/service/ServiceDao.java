package com.sumames.sir.service;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.entity.PurchaseOrder;
import com.sumames.sir.entity.PurchaseOrderDetail;
import com.sumames.sir.entity.PurchaseRequest;
import com.sumames.sir.entity.PurchaseRequestDetail;
import com.sumames.sir.entity.Rent;
import com.sumames.sir.entity.RentDetail;
import java.util.Date;
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

    public List<Customer> getCustomersNotDeleted();

    public Car getCarById(Integer id);

    public List<Car> getListCarById(int id);

    public List<Car> getCars();

    public Employer getEmployerById(Integer id);

    public List<Employer> getEmployers();

    public List<Employer> getEmployersNotDeleted();

    public Garage getGarageById(Integer id);

    public List<Garage> getGarages();

    public Login getLoginById(Integer id);

    public List<Login> getLogins();

    public Login getByUsername(String username);

    public LoginAccess getAccessById(Integer id);

    public List<LoginAccess> getAccesses();

    public Rent getRentById(Integer id);

    public List<Rent> getRents();

    public List<Rent> getRents(Date start, Date end);

    public List<Rent> getRentsNotReturned(Date start, Date end);

    public List<Rent> getRentsReturned(Date start, Date end);

    public RentDetail getRentDetailById(Integer id);

    public List<RentDetail> getRentDetails();

    public List<RentDetail> getListRentById(int id);

    public PurchaseRequest getPurchaseRequestById(Integer id);

    public List<PurchaseRequest> getListRequestById(int id);

    public List<PurchaseRequest> getRequest();

    public PurchaseRequestDetail getPurchaseRequestDetailById(Integer id);

    public List<PurchaseRequestDetail> getListRequestDetailById(int id);

    public List<PurchaseRequestDetail> getListRequestDetailByNo(int no);

    public List<PurchaseRequestDetail> getRequestDetail();

    public PurchaseOrder getPurchaseOrderById(Integer id);

    public List<PurchaseOrder> getOrder();

    public PurchaseOrderDetail getPurchaseOrderDetailById(Integer id);

    public List<PurchaseOrderDetail> getOrderDetail();

    public List<PurchaseOrderDetail> getListOrderDetailById(int id);
}

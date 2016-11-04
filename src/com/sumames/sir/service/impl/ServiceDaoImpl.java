package com.sumames.sir.service.impl;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.entity.PurchaseInvoice;
import com.sumames.sir.entity.PurchaseInvoiceDetail;
import com.sumames.sir.entity.PurchaseOrder;
import com.sumames.sir.entity.PurchaseOrderDetail;
import com.sumames.sir.entity.PurchasePayment;
import com.sumames.sir.entity.PurchasePaymentInvoice;
import com.sumames.sir.entity.PurchaseRequest;
import com.sumames.sir.entity.PurchaseRequestDetail;
import com.sumames.sir.entity.Rent;
import com.sumames.sir.entity.RentDetail;
import com.sumames.sir.service.ServiceDao;
import java.util.Date;
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
    public List<Customer> getCustomersNotDeleted() {
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
        List<Car> list = getCurrentSession().createQuery("FROM Car a ORDER BY a.recordId ASC").list();
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
    public List<Employer> getEmployersNotDeleted() {
        List<Employer> list = getCurrentSession().createQuery("FROM Employer a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
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

    @Override
    public Rent getRentById(Integer id) {
        Rent t = (Rent) getCurrentSession().get(Rent.class, id);
        return t;
    }

    @Override
    public List<Rent> getRents() {
        List<Rent> list = getCurrentSession().createQuery("FROM Rent a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<Rent> getRents(Date start, Date end) {
        List<Rent> list = getCurrentSession().createQuery("FROM Rent a WHERE date >= :start AND date <= :end ORDER BY a.recordId ASC")
                .setParameter("start", start).setParameter("end", end).list();
        return list;
    }

    @Override
    public List<Rent> getRentsNotReturned(Date start, Date end) {
        List<Rent> list = getCurrentSession().createQuery("FROM Rent a WHERE date >= :start AND date <= :end AND returned = 0 ORDER BY a.recordId ASC")
                .setParameter("start", start).setParameter("end", end).list();
        return list;
    }

    @Override
    public List<Rent> getRentsReturned(Date start, Date end) {
        List<Rent> list = getCurrentSession().createQuery("FROM Rent a WHERE date >= :start AND date <= :end AND returned = 1 ORDER BY a.recordId ASC")
                .setParameter("start", start).setParameter("end", end).list();
        return list;
    }

    @Override
    public RentDetail getRentDetailById(Integer id) {
        RentDetail t = (RentDetail) getCurrentSession().get(RentDetail.class, id);
        return t;
    }

    @Override
    public List<RentDetail> getRentDetails() {
        List<RentDetail> list = getCurrentSession().createQuery("FROM RentDetail a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<RentDetail> getListRentById(int id) {
        List<RentDetail> list = getCurrentSession().createQuery("from RentDetail where rent_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public PurchaseRequest getPurchaseRequestById(Integer id) {
        PurchaseRequest t = (PurchaseRequest) getCurrentSession().get(PurchaseRequest.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRequest> getListRequestById(int id) {
        List<PurchaseRequest> list = getCurrentSession().createQuery("from PurchaseRequest where record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public PurchaseRequestDetail getPurchaseRequestDetailById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRequestDetail> getListRequestDetailById(int id) {
        List<PurchaseRequestDetail> list = getCurrentSession().createQuery("from PurchaseRequestDetail where purchase_request_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public List<PurchaseRequest> getRequest() {
        List<PurchaseRequest> list = getCurrentSession().createQuery("FROM PurchaseRequest a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseRequestDetail> getRequestDetail() {
        List<PurchaseRequestDetail> list = getCurrentSession().createQuery("FROM PurchaseRequestDetail a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseRequestDetail> getListRequestDetailByNo(int no) {
        List<PurchaseRequestDetail> list = getCurrentSession().createQuery("from PurchaseRequestDetail where purchase_request_no=:no")
                .setParameter("no", no).list();
        return list;
    }

    @Override
    public PurchaseOrder getPurchaseOrderById(Integer id) {
        PurchaseOrder t = (PurchaseOrder) getCurrentSession().get(PurchaseOrder.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseOrder> getOrder() {
        List<PurchaseOrder> list = getCurrentSession().createQuery("FROM PurchaseOrder a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public PurchaseOrderDetail getPurchaseOrderDetailById(Integer id) {
        PurchaseOrderDetail t = (PurchaseOrderDetail) getCurrentSession().get(PurchaseOrderDetail.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseOrderDetail> getOrderDetail() {
        List<PurchaseOrderDetail> list = getCurrentSession().createQuery("FROM PurchaseOrder a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseOrderDetail> getListOrderDetailById(int id) {
        List<PurchaseOrderDetail> list = getCurrentSession().createQuery("from PurchaseOrderDetail where purchase_order_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public PurchaseInvoice getInvoiceById(Integer id) {
        PurchaseInvoice t = (PurchaseInvoice) getCurrentSession().get(PurchaseInvoice.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseInvoice> getInvoices() {
        List<PurchaseInvoice> list = getCurrentSession().createQuery("FROM PurchaseInvoice a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseInvoice> getInvoices(Date start, Date end) {
        List<PurchaseInvoice> list = getCurrentSession().createQuery("FROM PurchaseInvoice a WHERE date >= :start AND date <= :end ORDER BY a.recordId ASC")
                .setParameter("start", start).setParameter("end", end).list();
        return list;
    }

    @Override
    public PurchaseInvoiceDetail getInvoiceDetailById(Integer id) {
        PurchaseInvoiceDetail t = (PurchaseInvoiceDetail) getCurrentSession().get(PurchaseInvoiceDetail.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseInvoiceDetail> getInvoiceDetails() {
        List<PurchaseInvoiceDetail> list = getCurrentSession().createQuery("FROM PurchaseInvoiceDetail a ORDER BY a.recordId ASC").list();
        return list;
    }
    
    @Override
    public PurchasePayment getPaymentById(Integer id) {
        PurchasePayment t = (PurchasePayment) getCurrentSession().get(PurchasePayment.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchasePayment> getPayments() {
        List<PurchasePayment> list = getCurrentSession().createQuery("FROM PurchasePayment a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchasePayment> getPayments(Date start, Date end) {
        List<PurchasePayment> list = getCurrentSession().createQuery("FROM PurchasePayment a WHERE date >= :start AND date <= :end ORDER BY a.recordId ASC")
                .setParameter("start", start).setParameter("end", end).list();
        return list;
    }

    @Override
    public PurchasePaymentInvoice getPaymentInvoiceById(Integer id) {
        PurchasePaymentInvoice t = (PurchasePaymentInvoice) getCurrentSession().get(PurchasePaymentInvoice.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchasePaymentInvoice> getPaymentInvoices() {
        List<PurchasePaymentInvoice> list = getCurrentSession().createQuery("FROM PurchasePaymentInvoice a ORDER BY a.recordId ASC").list();
        return list;
    }

}

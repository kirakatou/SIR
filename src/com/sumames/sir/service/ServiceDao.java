package com.sumames.sir.service;

import com.sumames.sir.entity.AccountChart;
import com.sumames.sir.entity.AccountGroup;
import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Journal;
import com.sumames.sir.entity.JournalDetail;
import com.sumames.sir.entity.Ledger;
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
import com.sumames.sir.entity.RentInvoice;
import com.sumames.sir.entity.RentInvoice2;
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
    
    public List<RentInvoice> getRentInvoices();
    
    public List<RentInvoice> getListRentInvoiceById(int id);
    
    public List<RentInvoice2> getListRentInvoice2ById(int id);
    
    public PurchaseRequest getPurchaseRequestById(Integer id);

    public List<PurchaseRequest> getListRequestById(int id);
    
    public List<PurchaseRequest> getRequestAgreed();

    public List<PurchaseRequest> getRequest();
    
    public List<PurchaseRequest> getRequestNotDeleted();
    
    public List<PurchaseOrder> getOrdersNotDeleted();

    public PurchaseRequestDetail getPurchaseRequestDetailById(Integer id);

    public List<PurchaseRequestDetail> getListRequestDetailById(int id);

    public List<PurchaseRequestDetail> getListRequestDetailByNo(int no);

    public List<PurchaseRequestDetail> getRequestDetail();

    public PurchaseOrder getPurchaseOrderById(Integer id);

    public List<PurchaseOrder> getOrder();

    public PurchaseOrderDetail getPurchaseOrderDetailById(Integer id);

    public List<PurchaseOrderDetail> getOrderDetail();

    public List<PurchaseOrderDetail> getListOrderDetailById(int id);
    
    public PurchaseInvoice getInvoiceById(Integer id);

    public List<PurchaseInvoice> getInvoices();

    public List<PurchaseInvoice> getInvoices(Date start, Date end);
    
    public List<PurchaseInvoice> getInvoicesNotDeleted();

    public PurchaseInvoiceDetail getInvoiceDetailById(Integer id);

    public List<PurchaseInvoiceDetail> getInvoiceDetails();
    
    public PurchasePayment getPaymentById(Integer id);

    public List<PurchasePayment> getPayments();
    
    public List<PurchasePayment> getPaymentsNotDeleted();

    public List<PurchasePayment> getPayments(Date start, Date end);

    public PurchasePaymentInvoice getPaymentInvoiceById(Integer id);

    public List<PurchasePaymentInvoice> getPaymentInvoices();
    
    public AccountGroup getAccountGroupById(Integer id);

    public List<AccountGroup> getAccountGroups();

    public AccountChart getAccountChartById(Integer id);

    public List<AccountChart> getAccountCharts();
    
    public String getRentLast();
    
    public String getEmployerLast();
    
    public String getCustomerLast();
    
    public String getPurchaseRequestLast();
    
    public String getPurchaseOrderLast();
    
    public String getPurchaseInvoiceLast();
    
    public String getPurchasePaymentLast();

    public String getJournalLast();
    
    public Journal getJournalById(Integer id);
    
    public Journal getJournalByTransactionId(Integer from, Integer id);
    
    public Double getJournalDebit(Integer id);
    
    public Double getJournalCredit(Integer id);
    
    public boolean deleteJournalDetail(Integer id);
    
    public List<JournalDetail> getJournalDetailbyJournalId(Integer id);

    public List<Journal> getJournals();
    
    public List<PurchasePaymentInvoice> getListPaymentInvoiceById(Integer id);
    
    public List<PurchaseInvoice> getListPurchaseInvoiceById(Integer id);
    
    public List<PurchaseInvoiceDetail> getListInvoiceDetailById(Integer id);
    
    public List<Ledger> getLedgerByAccId(Date start, Date end, Integer id);
}

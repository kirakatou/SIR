package com.sumames.sir.service.impl;

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
import com.sumames.sir.service.ServiceDao;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
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
//    =================Customer==================

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
//    =================Car==================

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
//    =================Employer==================

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
//    =================Garage==================

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
//    =================Login==================

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
//    =================Access==================

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
//    ======================Rent=======================

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
    public List<RentInvoice2> getListRentInvoice2ById(int id) {
        List<RentInvoice2> list = getCurrentSession().createSQLQuery("SELECT rent_detail.record_id as recordId, rent_record_id as rentRecordId, car.record_id as carRecordId,car.name as carName, car.plate_number as carPlate, rent_detail.price as price , period, subtotal from rent_detail left join car on car.record_id = rent_detail.car_record_id where rent_record_id=:id ")
                .addEntity(RentInvoice2.class)
                .setParameter("id", id).list();
        System.out.println(list + "1");
        return list;
    }
//    =================Purchase Request==================

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
//    =================Purchase Order==================

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
//    =================Purchase Invoice==================

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
    public List<PurchaseInvoiceDetail> getListInvoiceDetailById(Integer id) {
        List<PurchaseInvoiceDetail> list = getCurrentSession().createQuery("from PurchaseInvoiceDetail where purchase_Invoice_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }
//    =================Purchase Payment==================

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
//  =====================Payment Invoice===================

    @Override
    public List<PurchasePaymentInvoice> getListPaymentInvoiceById(Integer id) {
        List<PurchasePaymentInvoice> list = getCurrentSession().createQuery("from PurchasePaymentInvoice where purchase_Payment_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }
//    =================Purchase Invoice==================

    @Override
    public List<PurchaseInvoice> getListPurchaseInvoiceById(Integer id) {
        List<PurchaseInvoice> list = getCurrentSession().createQuery("from PurchaseInvoice where record_id=:id")
                .setParameter("id", id).list();
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

//    =================Account Group==================
    @Override
    public AccountGroup getAccountGroupById(Integer id) {
        AccountGroup t = (AccountGroup) getCurrentSession().get(AccountGroup.class, id);
        return t;
    }

    @Override
    public List<AccountGroup> getAccountGroups() {
        List<AccountGroup> list = getCurrentSession().createQuery("FROM AccountGroup a ORDER BY a.recordId ASC").list();
        return list;
    }

//    =================Account Chart==================    
    @Override
    public AccountChart getAccountChartById(Integer id) {
        AccountChart t = (AccountChart) getCurrentSession().get(AccountChart.class, id);
        return t;
    }

    @Override
    public List<AccountChart> getAccountCharts() {
        List<AccountChart> list = getCurrentSession().createQuery("FROM AccountChart a ORDER BY a.recordId ASC").list();
        return list;
    }

//    =================Rent Invoice==================
    @Override
    public List<RentInvoice> getRentInvoices() {
        List<RentInvoice> list = getCurrentSession().createQuery("FROM RentInvoice a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<RentInvoice> getListRentInvoiceById(int id) {
        List<RentInvoice> list = getCurrentSession().createQuery("from RentInvoice where rent_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }
//    =================Journal==================    

    @Override
    public Journal getJournalById(Integer id) {
        Journal t = (Journal) getCurrentSession().get(Journal.class, id);
        return t;
    }

    @Override
    public Journal getJournalByTransactionId(Integer from, Integer id) {
        Journal t = (Journal) getCurrentSession().createQuery("from Journal a where a.transactionFrom=:tf AND a.transactionRecordId=:id")
                .setParameter("tf", from)
                .setParameter("id", id)
                .uniqueResult();
        return t;
    }

    @Override
    public List<Journal> getJournals() {
        List<Journal> list = getCurrentSession().createQuery("FROM Journal a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Double getJournalDebit(Integer id) {
        System.out.println(id + "debit");
        Double debit = (Double) getCurrentSession().createQuery("Select SUM(a.debetTransaction) FROM JournalDetail a where journal_record_id =:id GROUP BY journal_record_id")
                .setParameter("id", id)
                .uniqueResult();
        System.out.println(debit + "debit");
        return debit;
    }

    @Override
    public Double getJournalCredit(Integer id) {
        System.out.println(id + "credit");
        Double credit = (Double) getCurrentSession().createQuery("Select SUM(a.creditTransaction) FROM JournalDetail a where journal_record_id =:id GROUP BY journal_record_id")
                .setParameter("id", id)
                .uniqueResult();
        System.out.println(credit + "credit");
        return credit;
    }

    @Override
    public List<JournalDetail> getJournalDetailbyJournalId(Integer id) {
        List<JournalDetail> list = getCurrentSession().createQuery("from JournalDetail where journal_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean deleteJournalDetail(Integer id) {
        Query query = getCurrentSession().createQuery("delete from JournalDetail where journal_record_id =:id")
                .setParameter("id", id);
        int result = query.executeUpdate();
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
//    =================Ledger==================

    @Override
    public List<Ledger> getLedgerByAccId(Date start, Date end, Integer id) {
        List<Ledger> list = getCurrentSession().createQuery("FROM Ledger a WHERE date >= :start AND date <= :end and account_record_id =:id ORDER BY a.recordId ASC")
                .setParameter("start", start)
                .setParameter("end", end)
                .setParameter("id", id).list();
        return list;
    }

//    =================Auto Number==================
    @Override
    public String getRentLast() {
        Rent last = (Rent) getCurrentSession().createQuery("from Rent a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getJournalLast() {
        Journal last = (Journal) getCurrentSession().createQuery("from Journal a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;

        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getCustomerLast() {
        Customer last = (Customer) getCurrentSession().createQuery("from Customer a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getPurchaseRequestLast() {
        PurchaseRequest last = (PurchaseRequest) getCurrentSession().createQuery("from PurchaseRequest a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getPurchaseOrderLast() {
        PurchaseOrder last = (PurchaseOrder) getCurrentSession().createQuery("from PurchaseOrder a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getPurchaseInvoiceLast() {
        PurchaseInvoice last = (PurchaseInvoice) getCurrentSession().createQuery("from PurchaseInvoice a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getPurchasePaymentLast() {
        PurchasePayment last = (PurchasePayment) getCurrentSession().createQuery("from PurchasePayment a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public String getEmployerLast() {
        Employer last = (Employer) getCurrentSession().createQuery("from Employer a order by a.no DESC").setMaxResults(1).uniqueResult();
        String format;
        if (last == null) {
            format = "";
        } else {
            format = String.format("%03d", Integer.parseInt(last.getNo().substring(last.getNo().length() - 3)));
        }
        return format;
    }

    @Override
    public List<PurchaseRequest> getRequestNotDeleted() {
        List<PurchaseRequest> list = getCurrentSession().createQuery("FROM PurchaseRequest a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseOrder> getOrdersNotDeleted() {
        List<PurchaseOrder> list = getCurrentSession().createQuery("FROM PurchaseOrder a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseRequest> getRequestAgreed() {
        List<PurchaseRequest> list = getCurrentSession().createQuery("FROM PurchaseRequest a where a.agreed = 1 and a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchaseInvoice> getInvoicesNotDeleted() {
        List<PurchaseInvoice> list = getCurrentSession().createQuery("FROM PurchaseInvoice a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<PurchasePayment> getPaymentsNotDeleted() {
        List<PurchasePayment> list = getCurrentSession().createQuery("FROM PurchasePayment a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

}

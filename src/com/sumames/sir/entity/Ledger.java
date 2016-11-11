/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "ledger", catalog = "sir", schema = "")
public class Ledger implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "record_id")
    @Id
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "detail_record_id")
    private int detailRecordId;
    @Column(name = "no")
    private String no;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "account_record_id")
    private Integer accountRecordId;
    @Column(name = "account_no")
    private String accountNo;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "relation")
    private String relation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "debet_transaction")
    private Double debetTransaction;
    @Column(name = "credit_transaction")
    private Double creditTransaction;

    public Ledger() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getDetailRecordId() {
        return detailRecordId;
    }

    public void setDetailRecordId(int detailRecordId) {
        this.detailRecordId = detailRecordId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAccountRecordId() {
        return accountRecordId;
    }

    public void setAccountRecordId(Integer accountRecordId) {
        this.accountRecordId = accountRecordId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Double getDebetTransaction() {
        return debetTransaction;
    }

    public void setDebetTransaction(Double debetTransaction) {
        this.debetTransaction = debetTransaction;
    }

    public Double getCreditTransaction() {
        return creditTransaction;
    }

    public void setCreditTransaction(Double creditTransaction) {
        this.creditTransaction = creditTransaction;
    }
    
}

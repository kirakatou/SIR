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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "journal_detail", catalog = "sir", schema = "")
public class JournalDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "journal_record_id")
    private int journalRecordId;
    @Column(name = "account_chart_record_id")
    private Integer accountChartRecordId;
    @Column(name = "relation")
    private String relation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "debet_transaction")
    private Double debetTransaction;
    @Column(name = "credit_transaction")
    private Double creditTransaction;
    @Column(name = "note")
    private String note;
    @Column(name = "void_status")
    private Boolean voidStatus;
    @Column(name = "void_reason")
    private String voidReason;
    @Column(name = "void_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voidDatetime;
    @Column(name = "void_by_user_record_id")
    private Integer voidByUserRecordId;
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    @Column(name = "create_by_user_record_id")
    private Integer createByUserRecordId;
    @Column(name = "edit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    @Column(name = "edit_by_user_record_id")
    private Integer editByUserRecordId;
    @Column(name = "authorize_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorizeDatetime;
    @Column(name = "authorize_by_user_record_id")
    private Integer authorizeByUserRecordId;
    @Column(name = "delete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDatetime;
    @Column(name = "delete_by_user_record_id")
    private Integer deleteByUserRecordId;

    public JournalDetail() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getJournalRecordId() {
        return journalRecordId;
    }

    public void setJournalRecordId(int journalRecordId) {
        this.journalRecordId = journalRecordId;
    }

    public Integer getAccountChartRecordId() {
        return accountChartRecordId;
    }

    public void setAccountChartRecordId(Integer accountChartRecordId) {
        this.accountChartRecordId = accountChartRecordId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getVoidStatus() {
        return voidStatus;
    }

    public void setVoidStatus(Boolean voidStatus) {
        this.voidStatus = voidStatus;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public Date getVoidDatetime() {
        return voidDatetime;
    }

    public void setVoidDatetime(Date voidDatetime) {
        this.voidDatetime = voidDatetime;
    }

    public Integer getVoidByUserRecordId() {
        return voidByUserRecordId;
    }

    public void setVoidByUserRecordId(Integer voidByUserRecordId) {
        this.voidByUserRecordId = voidByUserRecordId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Integer getCreateByUserRecordId() {
        return createByUserRecordId;
    }

    public void setCreateByUserRecordId(Integer createByUserRecordId) {
        this.createByUserRecordId = createByUserRecordId;
    }

    public Date getEditDatetime() {
        return editDatetime;
    }

    public void setEditDatetime(Date editDatetime) {
        this.editDatetime = editDatetime;
    }

    public Integer getEditByUserRecordId() {
        return editByUserRecordId;
    }

    public void setEditByUserRecordId(Integer editByUserRecordId) {
        this.editByUserRecordId = editByUserRecordId;
    }

    public Date getAuthorizeDatetime() {
        return authorizeDatetime;
    }

    public void setAuthorizeDatetime(Date authorizeDatetime) {
        this.authorizeDatetime = authorizeDatetime;
    }

    public Integer getAuthorizeByUserRecordId() {
        return authorizeByUserRecordId;
    }

    public void setAuthorizeByUserRecordId(Integer authorizeByUserRecordId) {
        this.authorizeByUserRecordId = authorizeByUserRecordId;
    }

    public Date getDeleteDatetime() {
        return deleteDatetime;
    }

    public void setDeleteDatetime(Date deleteDatetime) {
        this.deleteDatetime = deleteDatetime;
    }

    public Integer getDeleteByUserRecordId() {
        return deleteByUserRecordId;
    }

    public void setDeleteByUserRecordId(Integer deleteByUserRecordId) {
        this.deleteByUserRecordId = deleteByUserRecordId;
    }

    
    
}

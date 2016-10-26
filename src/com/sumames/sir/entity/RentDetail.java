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
@Table(name = "rent_detail", catalog = "sir", schema = "")
public class RentDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    
    @Basic(optional = false)
    @Column(name = "rent_record_id")
    private int rentRecordId;
    
    @Basic(optional = false)
    @Column(name = "car_record_id")
    private int carRecordId;
    
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    
    @Basic(optional = false)
    @Column(name = "period")
    private int period;
    
    @Basic(optional = false)
    @Column(name = "subtotal")
    private double subtotal;
    
    @Basic(optional = false)
    @Column(name = "void_status")
    private boolean voidStatus;
    
    @Basic(optional = false)
    @Column(name = "void_reason")
    private String voidReason;
    
    @Basic(optional = false)
    @Column(name = "void_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voidDatetime;
    
    @Basic(optional = false)
    @Column(name = "void_by_user_record_id")
    private int voidByUserRecordId;
    
    @Basic(optional = false)
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    
    @Basic(optional = false)
    @Column(name = "create_by_user_record_id")
    private int createByUserRecordId;
    
    @Basic(optional = false)
    @Column(name = "edit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    
    @Basic(optional = false)
    @Column(name = "edit_by_user_record_id")
    private int editByUserRecordId;
    
    @Basic(optional = false)
    @Column(name = "authorize_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorizeDatetime;
    
    @Basic(optional = false)
    @Column(name = "authorize_by_user_record_id")
    private int authorizeByUserRecordId;
    
    @Basic(optional = false)
    @Column(name = "delete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDatetime;
    
    @Basic(optional = false)
    @Column(name = "delete_by_user_Record_id")
    private int deletebyuserRecordid;

    public RentDetail() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getRentRecordId() {
        return rentRecordId;
    }

    public void setRentRecordId(int rentRecordId) {
        this.rentRecordId = rentRecordId;
    }

    public int getCarRecordId() {
        return carRecordId;
    }

    public void setCarRecordId(int carRecordId) {
        this.carRecordId = carRecordId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isVoidStatus() {
        return voidStatus;
    }

    public void setVoidStatus(boolean voidStatus) {
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

    public int getVoidByUserRecordId() {
        return voidByUserRecordId;
    }

    public void setVoidByUserRecordId(int voidByUserRecordId) {
        this.voidByUserRecordId = voidByUserRecordId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public int getCreateByUserRecordId() {
        return createByUserRecordId;
    }

    public void setCreateByUserRecordId(int createByUserRecordId) {
        this.createByUserRecordId = createByUserRecordId;
    }

    public Date getEditDatetime() {
        return editDatetime;
    }

    public void setEditDatetime(Date editDatetime) {
        this.editDatetime = editDatetime;
    }

    public int getEditByUserRecordId() {
        return editByUserRecordId;
    }

    public void setEditByUserRecordId(int editByUserRecordId) {
        this.editByUserRecordId = editByUserRecordId;
    }

    public Date getAuthorizeDatetime() {
        return authorizeDatetime;
    }

    public void setAuthorizeDatetime(Date authorizeDatetime) {
        this.authorizeDatetime = authorizeDatetime;
    }

    public int getAuthorizeByUserRecordId() {
        return authorizeByUserRecordId;
    }

    public void setAuthorizeByUserRecordId(int authorizeByUserRecordId) {
        this.authorizeByUserRecordId = authorizeByUserRecordId;
    }

    public Date getDeleteDatetime() {
        return deleteDatetime;
    }

    public void setDeleteDatetime(Date deleteDatetime) {
        this.deleteDatetime = deleteDatetime;
    }

    public int getDeletebyuserRecordid() {
        return deletebyuserRecordid;
    }

    public void setDeletebyuserRecordid(int deletebyuserRecordid) {
        this.deletebyuserRecordid = deletebyuserRecordid;
    }

    
    
}

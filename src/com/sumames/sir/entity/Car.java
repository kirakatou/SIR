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
@Table(name = "car", catalog = "sir", schema = "")
@NamedQueries({
    @NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car c")})
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "car_garage_record_id")
    private int carGarageRecordId;
    @Column(name = "name")
    private String name;
    @Column(name = "plate_number")
    private String plateNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "availability")
    private Boolean availability;
    @Column(name = "void_status")
    private Boolean voidStatus;
    @Column(name = "void_reason")
    private String voidReason;
    @Column(name = "void_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voidDatetime;
    @Column(name = "void_by_user_record_id")
    private Integer voidByUserRecordId;
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
    @Column(name = "delete_by_user_Record_id")
    private Integer deletebyuserRecordid;

    public Car() {
    }

    public Car(Integer recordId) {
        this.recordId = recordId;
    }

    public Car(Integer recordId, int carGarageRecordId) {
        this.recordId = recordId;
        this.carGarageRecordId = carGarageRecordId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getCarGarageRecordId() {
        return carGarageRecordId;
    }

    public void setCarGarageRecordId(int carGarageRecordId) {
        this.carGarageRecordId = carGarageRecordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
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

    public Integer getDeletebyuserRecordid() {
        return deletebyuserRecordid;
    }

    public void setDeletebyuserRecordid(Integer deletebyuserRecordid) {
        this.deletebyuserRecordid = deletebyuserRecordid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumames.sir.entity.Car[ recordId=" + recordId + " ]";
    }
    
}

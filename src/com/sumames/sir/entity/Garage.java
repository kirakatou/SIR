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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "garage", catalog = "sir", schema = "")
public class Garage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "record_version")
    private Integer recordVersion;
    
    @Column(name = "default_status")
    private Boolean defaultStatus;
    
    @Column(name = "void_status")
    private Boolean voidStatus;
    
    @Column(name = "void_reason")
    private String voidReason;
    
    @Column(name = "void_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voidDatetime;
    
    @Column(name = "void_by_user_record_id")
    private Integer voidByUserRecordId;
    
    @Column(name = "create_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    
    @Column(name = "create_by_user_Record_id")
    private Integer createbyuserRecordid;
    
    @Column(name = "edit_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    
    @Column(name = "edit_by_user_Record_id")
    private Integer editbyuserRecordid;
    
    @Column(name = "authorize_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorizeDatetime;
    
    @Column(name = "authorize_by_user_Record_id")
    private Integer authorizebyuserRecordid;
    
    @Column(name = "delete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDatetime;
    
    @Column(name = "delete_by_user_Record_id")
    private Integer deletebyuserRecordid;

    public Garage() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    public Boolean getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
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

    public Integer getCreatebyuserRecordid() {
        return createbyuserRecordid;
    }

    public void setCreatebyuserRecordid(Integer createbyuserRecordid) {
        this.createbyuserRecordid = createbyuserRecordid;
    }

    public Date getEditDatetime() {
        return editDatetime;
    }

    public void setEditDatetime(Date editDatetime) {
        this.editDatetime = editDatetime;
    }

    public Integer getEditbyuserRecordid() {
        return editbyuserRecordid;
    }

    public void setEditbyuserRecordid(Integer editbyuserRecordid) {
        this.editbyuserRecordid = editbyuserRecordid;
    }

    public Date getAuthorizeDatetime() {
        return authorizeDatetime;
    }

    public void setAuthorizeDatetime(Date authorizeDatetime) {
        this.authorizeDatetime = authorizeDatetime;
    }

    public Integer getAuthorizebyuserRecordid() {
        return authorizebyuserRecordid;
    }

    public void setAuthorizebyuserRecordid(Integer authorizebyuserRecordid) {
        this.authorizebyuserRecordid = authorizebyuserRecordid;
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
    
}

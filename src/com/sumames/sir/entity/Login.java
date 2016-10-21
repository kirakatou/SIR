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
@Table(name = "login", catalog = "sir", schema = "")
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "employee_record_id")
    private int employeeRecordId;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "access_record_id")
    private int accessRecordId;
    
    @Column(name = "void_status")
    private boolean voidStatus;
    
    @Column(name = "void_reason")
    private String voidReason;
    
    @Column(name = "void_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voidDatetime;
    
    @Column(name = "void_by_user_record_id")
    private int voidByUserRecordId;
    
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    
    @Column(name = "create_by_user_record_id")
    private int createByUserRecordId;
    
    @Column(name = "edit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    
    @Column(name = "edit_by_user_record_id")
    private int editByUserRecordId;
    
    @Column(name = "authorize_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authorizeDatetime;
    
    @Column(name = "authorize_by_user_record_id")
    private int authorizeByUserRecordId;
    
    @Column(name = "delete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDatetime;
    
    @Column(name = "delete_by_user_Record_id")
    private int deletebyuserRecordid;

    public Login() {
    }

    public Login(Integer recordId) {
        this.recordId = recordId;
    }

    public Login(Integer recordId, int employeeRecordId, String username, String password, int accessRecordId, boolean voidStatus, String voidReason, Date voidDatetime, int voidByUserRecordId, Date createDatetime, int createByUserRecordId, Date editDatetime, int editByUserRecordId, Date authorizeDatetime, int authorizeByUserRecordId, Date deleteDatetime, int deletebyuserRecordid) {
        this.recordId = recordId;
        this.employeeRecordId = employeeRecordId;
        this.username = username;
        this.password = password;
        this.accessRecordId = accessRecordId;
        this.voidStatus = voidStatus;
        this.voidReason = voidReason;
        this.voidDatetime = voidDatetime;
        this.voidByUserRecordId = voidByUserRecordId;
        this.createDatetime = createDatetime;
        this.createByUserRecordId = createByUserRecordId;
        this.editDatetime = editDatetime;
        this.editByUserRecordId = editByUserRecordId;
        this.authorizeDatetime = authorizeDatetime;
        this.authorizeByUserRecordId = authorizeByUserRecordId;
        this.deleteDatetime = deleteDatetime;
        this.deletebyuserRecordid = deletebyuserRecordid;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getEmployeeRecordId() {
        return employeeRecordId;
    }

    public void setEmployeeRecordId(int employeeRecordId) {
        this.employeeRecordId = employeeRecordId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessRecordId() {
        return accessRecordId;
    }

    public void setAccessRecordId(int accessRecordId) {
        this.accessRecordId = accessRecordId;
    }

    public boolean getVoidStatus() {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumames.sir.entity.Login[ recordId=" + recordId + " ]";
    }
    
}

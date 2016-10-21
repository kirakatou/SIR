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
@Table(name = "login_access_detail", catalog = "sir", schema = "")
public class LoginAccessDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "access_record_id")
    private int accessRecordId;
    @Column(name = "name_menu")
    private String nameMenu;
    @Column(name = "view_data")
    private Boolean viewData;
    @Column(name = "add_data")
    private Boolean addData;
    @Column(name = "edit_data")
    private Boolean editData;
    @Column(name = "delete_data")
    private Boolean deleteData;
    @Column(name = "print")
    private Boolean print;
    @Column(name = "export")
    private Boolean export;
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
    @Column(name = "create_by_user_Record_id")
    private Integer createbyuserRecordid;
    @Column(name = "edit_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDatetime;
    @Column(name = "edit_by_user_record_id")
    private Integer editByUserRecordId;
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

    public LoginAccessDetail() {
    }

    public LoginAccessDetail(Integer recordId) {
        this.recordId = recordId;
    }

    public LoginAccessDetail(Integer recordId, int accessRecordId) {
        this.recordId = recordId;
        this.accessRecordId = accessRecordId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getAccessRecordId() {
        return accessRecordId;
    }

    public void setAccessRecordId(int accessRecordId) {
        this.accessRecordId = accessRecordId;
    }

    public String getNameMenu() {
        return nameMenu;
    }

    public void setNameMenu(String nameMenu) {
        this.nameMenu = nameMenu;
    }

    public Boolean getViewData() {
        return viewData;
    }

    public void setViewData(Boolean viewData) {
        this.viewData = viewData;
    }

    public Boolean getAddData() {
        return addData;
    }

    public void setAddData(Boolean addData) {
        this.addData = addData;
    }

    public Boolean getEditData() {
        return editData;
    }

    public void setEditData(Boolean editData) {
        this.editData = editData;
    }

    public Boolean getDeleteData() {
        return deleteData;
    }

    public void setDeleteData(Boolean deleteData) {
        this.deleteData = deleteData;
    }

    public Boolean getPrint() {
        return print;
    }

    public void setPrint(Boolean print) {
        this.print = print;
    }

    public Boolean getExport() {
        return export;
    }

    public void setExport(Boolean export) {
        this.export = export;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginAccessDetail)) {
            return false;
        }
        LoginAccessDetail other = (LoginAccessDetail) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumames.sir.entity.LoginAccessDetail[ recordId=" + recordId + " ]";
    }
    
}

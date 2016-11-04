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
@Table(name = "purchase_invoice", catalog = "sir", schema = "")
public class PurchaseInvoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "record_id")
    private Integer recordId;
    @Basic(optional = false)
    @Column(name = "purchase_order_record_id")
    private int purchaseOrderRecordId;
    @Column(name = "no")
    private String no;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "supplier_name")
    private String supplierName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "sub_total")
    private Double subTotal;
    @Column(name = "tax_percent")
    private Double taxPercent;
    @Column(name = "tax_value")
    private Double taxValue;
    @Column(name = "disc_percent")
    private Double discPercent;
    @Column(name = "disc_value")
    private Double discValue;
    @Column(name = "total")
    private Double total;
    @Column(name = "journal_record_id")
    private Integer journalRecordId;
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

    public PurchaseInvoice() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public int getPurchaseOrderRecordId() {
        return purchaseOrderRecordId;
    }

    public void setPurchaseOrderRecordId(int purchaseOrderRecordId) {
        this.purchaseOrderRecordId = purchaseOrderRecordId;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Double taxValue) {
        this.taxValue = taxValue;
    }

    public Double getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(Double discPercent) {
        this.discPercent = discPercent;
    }

    public Double getDiscValue() {
        return discValue;
    }

    public void setDiscValue(Double discValue) {
        this.discValue = discValue;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getJournalRecordId() {
        return journalRecordId;
    }

    public void setJournalRecordId(Integer journalRecordId) {
        this.journalRecordId = journalRecordId;
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

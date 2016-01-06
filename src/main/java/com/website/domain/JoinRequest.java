package com.website.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by chenyubao on 16/1/6.
 */
@Entity
@Table(name="joinrequest")
public class JoinRequest {
    private long id;
    private String companyname;
    private Timestamp reqtime;
    private String reqname;
    private String telephone;
    private String cellphone;
    private String email;
    private String qq;
    private String address;
    private Byte hasexperience;
    private Byte hasshops;
    private String reqcity;
    private Byte hasotherbrand;
    private String leavemsg;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyname", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "reqtime", nullable = true, insertable = true, updatable = true)
    public Timestamp getReqtime() {
        return reqtime;
    }

    public void setReqtime(Timestamp reqtime) {
        this.reqtime = reqtime;
    }

    @Basic
    @Column(name = "reqname", nullable = true, insertable = true, updatable = true, length = 50)
    public String getReqname() {
        return reqname;
    }

    public void setReqname(String reqname) {
        this.reqname = reqname;
    }

    @Basic
    @Column(name = "telephone", nullable = true, insertable = true, updatable = true, length = 30)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "cellphone", nullable = true, insertable = true, updatable = true, length = 30)
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "qq", nullable = true, insertable = true, updatable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "hasexperience", nullable = true, insertable = true, updatable = true)
    public Byte getHasexperience() {
        return hasexperience;
    }

    public void setHasexperience(Byte hasexperience) {
        this.hasexperience = hasexperience;
    }

    @Basic
    @Column(name = "hasshops", nullable = true, insertable = true, updatable = true)
    public Byte getHasshops() {
        return hasshops;
    }

    public void setHasshops(Byte hasshops) {
        this.hasshops = hasshops;
    }

    @Basic
    @Column(name = "reqcity", nullable = true, insertable = true, updatable = true, length = 20)
    public String getReqcity() {
        return reqcity;
    }

    public void setReqcity(String reqcity) {
        this.reqcity = reqcity;
    }

    @Basic
    @Column(name = "hasotherbrand", nullable = true, insertable = true, updatable = true)
    public Byte getHasotherbrand() {
        return hasotherbrand;
    }

    public void setHasotherbrand(Byte hasotherbrand) {
        this.hasotherbrand = hasotherbrand;
    }

    @Basic
    @Column(name = "leavemsg", nullable = true, insertable = true, updatable = true, length = 200)
    public String getLeavemsg() {
        return leavemsg;
    }

    public void setLeavemsg(String leavemsg) {
        this.leavemsg = leavemsg;
    }

}

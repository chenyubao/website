package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 16/1/6.
 */
@Entity
@Table(name="CompanyContacts")
public class CompanyContacts {
    private long id;
    private String companyName;
    private String address;
    private String telephone;
    private String fax;
    private String email;
    private String website;
    private String cellPhone;
    private String zipCode;
    private String weibo;
    private String weixin;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyName", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "telephone", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "fax", nullable = true, insertable = true, updatable = true, length = 50)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "website", nullable = true, insertable = true, updatable = true, length = 50)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "cellPhone", nullable = true, insertable = true, updatable = true, length = 30)
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Basic
    @Column(name = "zipCode", nullable = true, insertable = true, updatable = true, length = 20)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "weibo", nullable = true, insertable = true, updatable = true, length = 50)
    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    @Basic
    @Column(name = "weixin", nullable = true, insertable = true, updatable = true, length = 50)
    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

}

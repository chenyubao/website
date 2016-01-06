package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 15/12/7.
 */
@Entity
@Table(name="productProperty")
public class ProductProperty {
    private long id;
    private Integer productId;
    private String name;
    private String value;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productId", nullable = true, insertable = true, updatable = true)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 150)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "value", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

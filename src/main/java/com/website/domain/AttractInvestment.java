package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 16/1/6.
 */
@Entity
@Table(name="AttractInvestment")
public class AttractInvestment {
    private long id;
    private String support;
    private String steps;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "support", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Basic
    @Column(name = "steps", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

}

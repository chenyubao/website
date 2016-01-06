package com.website.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by chenyubao on 16/1/6.
 */
@Entity
@Table(name="CompanyNews")
public class CompanyNews {
    private long id;
    private String title;
    private String details;
    private Timestamp createdAt;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "details", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "createdAt", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}

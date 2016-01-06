package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 15/12/7.
 */
@Entity
@Table(name="Category")
public class Category {
    private long id;
    private String name;
    private Integer isParent;
    private Integer parentId;
    private String imageUrl;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "isParent", nullable = true, insertable = true, updatable = true)
    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    @Basic
    @Column(name = "parentId", nullable = true, insertable = true, updatable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "imageURL", nullable = true, insertable = true, updatable = true, length = 150)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

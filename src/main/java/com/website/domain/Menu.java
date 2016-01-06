package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 15/12/7.
 */
@Entity
@Table(name="menu")
public class Menu {
    private long id;
    private String name;
    private Integer parentId;
    private Integer position;
    private String image;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "position", nullable = true, insertable = true, updatable = true)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "image", nullable = true, insertable = true, updatable = true, length = 150)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}

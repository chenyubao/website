package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 15/12/7.
 */
@Entity
@Table(name="product")
public class Product {
    private long id;
    private String name;
    private Category category;
    private String imageUrl;

    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    @JoinColumn(name = "categoryId")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

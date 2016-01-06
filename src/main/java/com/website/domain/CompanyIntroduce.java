package com.website.domain;

import javax.persistence.*;

/**
 * Created by chenyubao on 16/1/6.
 */
@Entity
@Table(name="CompanyIntroduce")
public class CompanyIntroduce {
    private long id;
    private String description;
    private String titleImage;
    private String backgroundImage;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "titleImage", nullable = true, insertable = true, updatable = true, length = 200)
    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    @Basic
    @Column(name = "backgroundImage", nullable = true, insertable = true, updatable = true, length = 200)
    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

}

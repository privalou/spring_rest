package com.pupiq.restfordiploma.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    private Integer id;
    @Column(name = "name")
    private String name;

    public Category() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

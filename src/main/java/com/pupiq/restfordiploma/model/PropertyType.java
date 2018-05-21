package com.pupiq.restfordiploma.model;

import javax.persistence.*;

@Entity
@Table(name = "property_type")
public class PropertyType {
    private Integer id;
    @Column(name = "name")
    private String name;

    public PropertyType() {
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

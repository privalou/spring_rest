package com.pupiq.restfordiploma.model;

import javax.persistence.*;

@Entity
@Table(name = "organisation")
public class Organisation {

    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    public Organisation() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

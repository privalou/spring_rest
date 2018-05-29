package com.pupiq.restfordiploma.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organisation")
public class Organisation {

    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "physical_address")
    private String physicalAddress;

    @Column(name = "legal_address")
    private String legallAddress;

    @Column(name = "phone")
    private String phone;

    @JsonIgnore
    private List<Road> roads;

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

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getLegallAddress() {
        return legallAddress;
    }

    public void setLegallAddress(String legallAddress) {
        this.legallAddress = legallAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToMany(mappedBy = "organisation", fetch = FetchType.LAZY)
    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}

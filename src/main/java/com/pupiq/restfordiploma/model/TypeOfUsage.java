package com.pupiq.restfordiploma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_of_usage")
public class TypeOfUsage {
    private Integer id;
    @Column(name = "name")
    private String name;

    private List<Road> roads;

    public TypeOfUsage() {
    }

    public TypeOfUsage(String name) {
        this.name = name;
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

    @OneToMany(mappedBy = "typeOfUsage", fetch = FetchType.LAZY)
    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}

package com.pupiq.restfordiploma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "road")
public class Road{

    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "note")
    private String note;

    private List<Violation> violations;


    public Road() {
    }

    public Road(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public Road(Integer id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @OneToMany(mappedBy = "road", fetch = FetchType.LAZY)
    public List<Violation> getViolations() {
        return violations;
    }

    public void setViolations(List<Violation> violations) {
        this.violations = violations;
    }

    @Override
    public String toString() {
        return "Road{" +
                " name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
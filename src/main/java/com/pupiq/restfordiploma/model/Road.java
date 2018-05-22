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

    private Category category;

    private PropertyType propertyType;

    private RoadClass roadClass;

    private TransitCondition transitCondition;

    private TypeOfUsage typeOfUsage;


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

    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "property_type_id")
    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    @ManyToOne
    @JoinColumn(name = "road_class_id")
    public RoadClass getRoadClass() {
        return roadClass;
    }

    public void setRoadClass(RoadClass roadClass) {
        this.roadClass = roadClass;
    }

    @ManyToOne
    @JoinColumn(name = "transit_condition_id")
    public TransitCondition getTransitCondition() {
        return transitCondition;
    }

    public void setTransitCondition(TransitCondition transitCondition) {
        this.transitCondition = transitCondition;
    }

    @ManyToOne
    @JoinColumn(name = "type_of_usage_id")
    public TypeOfUsage getTypeOfUsage() {
        return typeOfUsage;
    }

    public void setTypeOfUsage(TypeOfUsage typeOfUsage) {
        this.typeOfUsage = typeOfUsage;
    }

    @Override
    public String toString() {
        return "Road{" +
                " name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
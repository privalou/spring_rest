package com.pupiq.restfordiploma.model;

import javax.persistence.*;

@Entity
@Table(name = "violations")
public class Violation extends AuditModel {

    private Integer id;
    private Road road;
    private User user;
    private double latitude;
    private double longitude;
    private int length;
    private int width;
    private int depth;
    private String status;
    private byte[] image;

    public Violation() {
    }

    public Violation(int id, Road road, User user, double latitude, double longitude, int length, int width, int depth, String status, byte[] image) {
        this.id = id;
        this.road = road;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.status = status;
        this.image = image;
    }

    public Violation(Road road, User user, double latitude, double longitude, int length, int width, int depth, String status, byte[] image) {
        this.road = road;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.status = status;
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "road_id")
    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "id=" + id +
                ", road=" + road +
                ", user=" + user.getUsername() +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", status='" + status + '\'' +
                '}';
    }
}

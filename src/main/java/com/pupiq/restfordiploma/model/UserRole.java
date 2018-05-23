package com.pupiq.restfordiploma.model;


import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
    private Integer id;
    @Column(name = "role_name")
    private String roleName;

    public UserRole() {
    }

    public UserRole(int id) {
        this.id = id;
        switch (id) {
            case 1:
                roleName = String.valueOf(Roles.ADMINISTRATOR);
                break;
            case 2:
                roleName = String.valueOf(Roles.USER);
                break;
            default:
                roleName = String.valueOf(Roles.USER);
                break;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    private enum Roles {ADMINISTRATOR, USER}
}

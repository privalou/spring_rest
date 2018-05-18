package com.pupiq.restfordiploma.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole extends AuditModel {
    @Id
    private Integer id;
    @Column(name = "role_name")
    private String roleName;

    private enum Roles {ADMINISTRATOR, USER}

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

    public int getId() {
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
}

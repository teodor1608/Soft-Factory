package com.soft_factory.entities;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_chief_ID")
    private Long departmentChiefID;

    @Column(name = "department_name")
    private String departmentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartmentChiefID() {
        return departmentChiefID;
    }

    public void setDepartmentChiefID(Long departmentChiefID) {
        this.departmentChiefID = departmentChiefID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public Department(Long departmentChiefID, String departmentName) {
        this.departmentChiefID = departmentChiefID;
        this.departmentName = departmentName;
    }
}

package com.project.integrator_engine.mysqlrepositories.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "employee")
public class Employee  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int employee_id;

    @Column(name = "emp_name")
    private String  name ;

    //implement somekind of regex here to make sure only email as string is storing here
    private String email;

    @OneToMany
    private List<Asset> assetList;
    public Employee(int employee_id, String name, String email) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
    }

}

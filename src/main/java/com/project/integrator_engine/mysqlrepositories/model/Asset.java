package com.project.integrator_engine.mysqlrepositories.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Asset {
    @Id
    private int id;
    private String type ;
    @OneToOne
    private int ownerId;
}

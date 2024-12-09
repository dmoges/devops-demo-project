package com.deepak.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    private Long id;
    @Column(name="first_name")
    private String firstName;
}
package com.deepak.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    private Long id;
}
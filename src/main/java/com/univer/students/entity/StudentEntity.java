package com.univer.students.entity;

import jakarta.persistence.*;

@Entity
@Table(name="STUDENT")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id Student")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="LAST NAME")
    private String lastname;



}

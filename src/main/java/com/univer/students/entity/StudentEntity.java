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

    @Column(name="LAST_NAME")
    private String lastname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }
}

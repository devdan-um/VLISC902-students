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

    @Column (name = "CURSO")
    private Integer curso;


    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

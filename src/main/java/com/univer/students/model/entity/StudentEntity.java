package com.univer.students.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "STUDENT")

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_STUDENT")
    private int id;

    @Column(name = "NAME")
    private String name;

   @Column (name="LAST_NAME")
  private String lastName;
   @Column (name= "Curso")
   private Integer curso;

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

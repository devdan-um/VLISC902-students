package com.univer.students.model.request;

public class StudentRequest {

    private String name;
private String lastName;
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
}

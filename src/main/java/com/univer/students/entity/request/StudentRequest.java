package com.univer.students.entity.request;

public class StudentRequest {
    private String name;
private String lastName;
private Integer curso;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}

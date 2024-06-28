package com.univer.students.controller;

import com.univer.students.Repository.StudentRepository;
import com.univer.students.model.entity.StudentEntity;
import com.univer.students.model.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("student/register")

    public String student(){
        return "register";


    }
    @PostMapping("success")
    public String success(@ModelAttribute StudentRequest request){
        StudentEntity estudiante= new StudentEntity();
        estudiante.setName(request.getName());
        this.studentRepository.save(estudiante);

        System.out.println(request);
        return "success";
    }
}

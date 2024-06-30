package com.univer.students.controller;

import com.univer.students.entity.StudentEntity;
import com.univer.students.entity.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.univer.students.repository.Studentsrepository;

@Controller

public class StudentController {

    @GetMapping("student/register")
public  String students(){
        return "register";
    }

    @Autowired
    private Studentsrepository studentsRepository;

    public String student(){
        return "register";


    }
    @PostMapping("success")
    public String success(@ModelAttribute StudentRequest request){

        StudentEntity estudiante = new StudentEntity();
        estudiante.setName(request.getName());
        this.studentsRepository.save(estudiante);

        System.out.println(request);
        return "success";
    }
}

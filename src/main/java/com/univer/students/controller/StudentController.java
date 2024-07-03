package com.univer.students.controller;

import com.univer.students.Repository.StudentRepository;
import com.univer.students.entity.StudentEntity;
import com.univer.students.entity.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@@ -9,6 +12,8 @@
@Controller

public class StudentController {
    @Autowired
    private StudentRepository StudentRepository;
    @GetMapping("student/register")

    public String student(){
        @@ -18,6 +23,10 @@ public String student(){
        }
        @PostMapping("success")
        public String success(@ModelAttribute StudentRequest request){
            StudentEntity estudiante= new StudentEntity();
            estudiante.setName(request.getName());

            this.StudentRepository.save(estudiante);

            System.out.println(request);
            return "success";

package com.univer.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("student/register")
    public String student(){
        return "register";
    }
    @PostMapping("success")
    public String success(@ModelAttribute StudentRequest request){
        System.out.println(request);
        return "success";
    }
}

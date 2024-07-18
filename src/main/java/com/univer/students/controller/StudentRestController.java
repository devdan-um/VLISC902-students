package com.univer.students.controller;

import com.univer.students.model.response.StudentResponse;
import com.univer.students.model.response.entity.StudentEntity;
import com.univer.students.model.response.entity.request.StudentRequest;
import com.univer.students.repository.StudentsRepository;
import com.univer.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    public StudentService studentService;

    @GetMapping("api/univer/estudiante/{id}")
    public ResponseEntity studiante(@PathVariable String id) {
        StudentResponse response=this.studentService.getStudent(Integer.parseInt(id));

        if (response != null){
            return new ResponseEntity<>(response, HttpStatus.CREATED);


        } else {
            return new ResponseEntity<>("no se tiene registro de este ID",HttpStatus.NO_CONTENT);

        }

    }

    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado(@RequestBody StudentRequest request){


StudentResponse response=this.studentService.saveStudent(request);



        return new ResponseEntity(response, HttpStatus.CREATED);



    }

}


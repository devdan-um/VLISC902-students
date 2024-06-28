package com.univer.students.controller;

import com.univer.students.Repository.StudentRepository;
import com.univer.students.model.entity.StudentEntity;
import com.univer.students.model.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("api/univer/estudiante/{id}")
    public StudentEntity studiante(@PathVariable String id){
        Optional< StudentEntity> entity=
        this.studentRepository.findById(Integer.parseInt(id));
        if (entity.isPresent()) {
            return entity.get();
        }else{
            return null;
        }
    }
    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado (@RequestBody StudentRequest request){

        StudentEntity entity=new StudentEntity();
        entity.setName(request.getLastName());
        entity.setCurso(request.getCurso());

        this.studentRepository.save(entity);
        return ResponseEntity.ok( "se guardo de manera correcta");
    }
}

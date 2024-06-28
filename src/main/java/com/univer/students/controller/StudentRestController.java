package com.univer.students.controller;

import com.univer.students.Repository.StudentRepository;
import com.univer.students.entity.StudentEntity;
import com.univer.students.entity.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepository StudentRepository;

    @GetMapping ("api/univer/estudiante/{id}")
    public StudentEntity studiante(@PathVariable String id){
        Optional<StudentEntity> entity=
this.StudentRepository.findById(Integer.parseInt(id));
        if(entity.isPresent()){
            return entity.get();
        }else{
            return null;
        }
    }

    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado(@RequestBody StudentRequest request){
        StudentEntity entity= new StudentEntity();
        entity.setName(request.getName());
        entity.setLastname(request.getLastName());
        entity.setCurso(request.getCurso());

        this.StudentRepository.save(entity);
        return ResponseEntity.ok( "Se guardo exitosamente");
    }
}

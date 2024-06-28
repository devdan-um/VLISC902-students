package com.univer.students.controller;

import com.univer.students.model.entity.StudentEntity;
import com.univer.students.repository.StudentsRepository;
import com.univer.students.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("api/univer/estudiante/{id}")
    public StudentEntity estudiante(@PathVariable String id){
        Optional<StudentEntity> entity =
                this.studentsRepository.findById(Integer.parseInt(id));
        if (entity.isPresent()){
            return entity.get();
        }else {
            return null;
        }
    }

    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado(@RequestBody StudentRequest request){

        StudentEntity estudiante=new StudentEntity();
        estudiante.setName(request.getName());
        estudiante.setLastName(request.getLastName());
        estudiante.setCurso(request.getCurso());

        this.studentsRepository.save(estudiante);

        return ResponseEntity.ok("Se guardo de manera correcta");
    }

}

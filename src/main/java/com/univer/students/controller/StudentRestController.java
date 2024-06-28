package com.univer.students.controller;

import com.univer.students.model.entity.StudentEntity;
import com.univer.students.model.request.StudentReques;
import com.univer.students.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("api/univer/estudiante/{id}")
    public StudentEntity studiante(@PathVariable String id){
        Optional<StudentEntity> entity =
                this.studentsRepository.findById(Integer.parseInt(id));

                if (entity.isPresent()){
                    return entity.get();
                }else {
                    return null;
                }

    }
    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado(@RequestBody StudentReques request){

        StudentEntity entity = new StudentEntity();
        entity.setName(request.getName());
        entity.setLastName(request.getLastName());
        entity.setCurso(request.getCurso());

        this.studentsRepository.save(entity);

        return ResponseEntity.ok( "Se guardo de forma correcta");

    }

}

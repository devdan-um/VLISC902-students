package com.univer.students.service;

import com.univer.students.model.response.StudentResponse;
import com.univer.students.model.response.entity.StudentEntity;
import com.univer.students.model.response.entity.request.StudentRequest;
import com.univer.students.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentsRepository studentsRepository;


    public StudentResponse getStudent(Integer id){
        Optional<StudentEntity> entity =
                this.studentsRepository.findById(id);


        if (entity.isPresent()) {
            StudentResponse response = new StudentResponse();
            response.setName(entity.get().getName());
            response.setLastName(entity.get().getLastname());
            return response;


        } else {
            return null;


        }

    }
    public StudentResponse saveStudent(StudentRequest request){
        StudentEntity entity = new StudentEntity();
        entity.setName(request.getName());
        entity.setLastname(request.getLastName());
        entity.setCurso(request.getCurso());
        this.studentsRepository.save(entity);
        StudentResponse response=new StudentResponse();
        response.setName(request.getName());
        response.setLastName(request.getLastName());
        return response;

    }
}

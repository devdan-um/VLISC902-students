package com.univer.students.repository;

import com.univer.students.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository
        extends CrudRepository<StudentEntity, Integer> {

}

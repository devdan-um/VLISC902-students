package com.univer.students.Repository;


import com.univer.students.model.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {

}

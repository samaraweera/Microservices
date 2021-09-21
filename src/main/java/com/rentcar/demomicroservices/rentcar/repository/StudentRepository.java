package com.rentcar.demomicroservices.rentcar.repository;

import com.rentcar.demomicroservices.rentcar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //Student save(Student student); --> When use JpaRepository no need sing of save method. But is use Repository then need use this method signature here
}

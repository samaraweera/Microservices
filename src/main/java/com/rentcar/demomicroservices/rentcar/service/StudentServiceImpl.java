package com.rentcar.demomicroservices.rentcar.service;

import com.rentcar.demomicroservices.rentcar.model.Student;
import com.rentcar.demomicroservices.rentcar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}

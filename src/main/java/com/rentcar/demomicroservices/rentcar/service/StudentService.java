package com.rentcar.demomicroservices.rentcar.service;

import com.rentcar.demomicroservices.rentcar.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}

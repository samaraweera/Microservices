package com.rentcar.demomicroservices.rentcar.controller;

import com.rentcar.demomicroservices.rentcar.model.Student;
import com.rentcar.demomicroservices.rentcar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    /**
     * localhost:8080/student
     * {
     *     "firstName" : "Priyantha",
     *     "lastName" :"Samaraweera"
     * }
     */
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    /**
     * localhost:8080/student?id=23
     */
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudentById(@RequestParam int id) {
        Student student = studentService.fetchStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }
}

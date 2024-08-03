package com.student_ms.student_ms.controller;

import com.student_ms.student_ms.model.Student;
import com.student_ms.student_ms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping("/greetings")
    public String greet() {
        return "Hello there from Student controller";
    }

    @GetMapping("/bye")
    public String goodBye() {
        return "Good bye from Student controller";

    }

    @GetMapping("/Hello")
    public String hello() {
        return "Hey";

    }

    @GetMapping("/place")
    public String place(){
        return "USA";
    }
@PostMapping("/save")
    Student save(Student student){
        return student;

}
@PostMapping("/register")
    public Student create(@RequestBody Student student){
        return student;
    }
@GetMapping("/{name}") // {} shows path variable
    public Student getByName(@PathVariable String name){
        return  studentService.findByName(name);
}
 @GetMapping("/getAllStudents")
 public List<Student> getAllStudents(){
        return studentService.getAllStudents();
 }

    @GetMapping("/{Id}")

    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id).orElse(null);

    }
    @PutMapping("/{id}") // update
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id,updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(){
        System.out.println("Student with Id " + id);


    }
    }

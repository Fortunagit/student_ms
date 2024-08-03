package com.student_ms.student_ms.service;

import com.student_ms.student_ms.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);

    Student findByName(String name);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);
    Student updateStudent(Long id , Student updatedStudent);

    List<Student> getStudentsByGender(String gender);
    void deleteStudent(Long id);


}
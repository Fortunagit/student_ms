package com.student_ms.student_ms.service;

import com.student_ms.student_ms.model.Student;
import com.student_ms.student_ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
 private StudentRepository studentRepository; //Inversion of control


    @Override
    public Student save (Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(updatedStudent.getName());
            student.setGender(updatedStudent.getGender());
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getStudentsByGender(String gender) {
        return studentRepository.findByGender(gender);
    }

    @Override
    public void deleteStudent(Long id) {
studentRepository.deleteById(id);
    }

}


package com.student_ms.student_ms.repository;

import com.student_ms.student_ms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // student used
    Student findByName(String name);
    List<Student> findByGender(String gender);





    // this student
    // when this is change to query select * from student where name = ":name"
}

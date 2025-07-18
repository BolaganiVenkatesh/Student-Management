package com.student.service;

import com.student.model.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
}

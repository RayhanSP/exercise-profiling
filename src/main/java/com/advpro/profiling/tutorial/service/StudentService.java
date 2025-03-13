package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        // Ambil semua StudentCourse dengan Student dan Course dalam satu query
        List<StudentCourse> studentCourses = studentCourseRepository.findAllWithStudentsAndCourses();

        // Optimasi dengan Map untuk menghindari object reference duplikasi
        Map<Long, Student> studentMap = new HashMap<>();
        studentCourses.forEach(sc ->
                studentMap.putIfAbsent(sc.getStudent().getId(), sc.getStudent())
        );

        // Pastikan setiap StudentCourse memiliki referensi Student yang sama di memory
        studentCourses.forEach(sc -> sc.setStudent(studentMap.get(sc.getStudent().getId())));

        return studentCourses;
    }


    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findStudentWithHighestGpa();
    }


    public String joinStudentNames() {
        List<String> studentNames = studentRepository.findAllStudentNames();
        return studentNames.isEmpty() ? "" : String.join(", ", studentNames);
    }

}


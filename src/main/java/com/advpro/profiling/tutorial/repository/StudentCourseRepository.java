package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {

    List<StudentCourse> findByStudentId(Long studentId);

    // Query optimal untuk fetch semua StudentCourse beserta Student dan Course dalam satu query
    @Query("SELECT sc FROM StudentCourse sc JOIN FETCH sc.student JOIN FETCH sc.course")
    List<StudentCourse> findAllWithStudentsAndCourses();
}
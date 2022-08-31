package com.etq.at.student.repository;

import com.etq.at.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT ts.std_id, ts.std_first_name, ts.std_last_name FROM t_student_course tsc LEFT JOIN t_student ts ON ts.std_id = tsc.std_id WHERE tsc.c_id = ?1", nativeQuery = true)
    List<Student> findAllStudentsByCourseId(Integer courseId);

}

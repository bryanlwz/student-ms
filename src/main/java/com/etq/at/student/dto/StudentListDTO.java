package com.etq.at.student.dto;

import com.etq.at.student.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentListDTO {
    private List<Student> students;

    public StudentListDTO(List<Student> students) {
        this.students = students;
    }
}

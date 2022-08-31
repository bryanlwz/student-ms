package com.etq.at.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_student_course")
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sc_id")
    private Integer id;

    @Column(name = "std_id")
    private String studentId;

    @Column(name = "c_id")
    private String courseId;

}

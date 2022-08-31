package com.etq.at.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private Integer id;

    @Column(name = "c_name")
    private String firstName;

    @Column(name = "c_yn")
    private String courseYn;

//    @ManyToMany(mappedBy = "courseSet")
//    Set<Student> studentSet;

}

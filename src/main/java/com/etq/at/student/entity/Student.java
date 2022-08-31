package com.etq.at.student.entity;

import com.etq.at.student.dto.StudentDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "std_id")
    private Integer id;

    @Column(name = "std_first_name")
    private String firstName;

    @Column(name = "std_last_name")
    private String lastName;

//    @ManyToMany
//    @JoinTable(
//            name = "t_student_course",
//            joinColumns = @JoinColumn(name = "std_id"),
//            inverseJoinColumns = @JoinColumn(name = "c_id"))
//    Set<Course> courseSet;

    public Student (StudentDTO student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
    }
}

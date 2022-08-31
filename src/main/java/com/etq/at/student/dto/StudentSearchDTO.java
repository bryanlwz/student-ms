package com.etq.at.student.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentSearchDTO {

    private Integer studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer courseId;

}

package com.etq.at.student.service;

import com.etq.at.student.dto.StudentDTO;
import com.etq.at.student.dto.StudentListDTO;
import com.etq.at.student.dto.StudentSearchDTO;

public interface StudentService {

    public StudentListDTO getStudentList(StudentSearchDTO searchDTO);
    public Boolean saveStudentDetails(StudentDTO studentDTO);
    public Boolean deleteStudent(Integer id);

}

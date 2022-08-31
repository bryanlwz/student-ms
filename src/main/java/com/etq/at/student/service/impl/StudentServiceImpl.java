package com.etq.at.student.service.impl;

import com.etq.at.student.dto.StudentDTO;
import com.etq.at.student.dto.StudentListDTO;
import com.etq.at.student.dto.StudentSearchDTO;
import com.etq.at.student.entity.Student;
import com.etq.at.student.repository.StudentRepository;
import com.etq.at.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentListDTO getStudentList(StudentSearchDTO searchDTO) {
        StudentListDTO studentsDTO = null;
        System.out.println("searchDTO.getCourseId():" + searchDTO.getCourseId());
        List<Student> students = studentRepository.findAllStudentsByCourseId(searchDTO.getCourseId());
        System.out.println(students.size());
        if (!students.isEmpty()) {
            studentsDTO = new StudentListDTO(students);
        }

        return studentsDTO;
    }

    private Boolean isSearchDtoEmpty(StudentSearchDTO searchDTO) {
        return (searchDTO.getStudentId() == null && searchDTO.getCourseId() == null)
                || (searchDTO.getStudentId() <= 0 && searchDTO.getCourseId() <= 0);
    }

    public Boolean saveStudentDetails(StudentDTO studentDTO) {
        try {
            Student student = new Student(studentDTO);
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            studentRepository.save(student);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public Boolean deleteStudent(Integer id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

}

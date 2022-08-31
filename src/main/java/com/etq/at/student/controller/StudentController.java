package com.etq.at.student.controller;

import com.etq.at.student.dto.StudentDTO;
import com.etq.at.student.dto.StudentListDTO;
import com.etq.at.student.dto.StudentSearchDTO;
import com.etq.at.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path= "/getlist", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentListDTO> getStudentList(@RequestBody StudentSearchDTO searchDTO) {
        StudentListDTO studentList = studentService.getStudentList(searchDTO);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping(path= "/save", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Boolean> addStudent(@RequestBody StudentDTO student) {
        Boolean result = studentService.saveStudentDetails(student);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(path= "/delete", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Boolean> deleteStudent(@RequestBody StudentDTO student) {
        Boolean result = studentService.deleteStudent(student.getId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

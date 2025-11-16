package com.mhdarslan.LearningRestAPIs.controller;

import com.mhdarslan.LearningRestAPIs.dto.StudentDto;
import com.mhdarslan.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    @GetMapping("/students")
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentBy(@PathVariable Long id){
        return studentService.getAllStudentById(id);
    }
}

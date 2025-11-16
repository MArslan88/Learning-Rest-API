package com.mhdarslan.LearningRestAPIs.controller;

import com.mhdarslan.LearningRestAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L,"Arslan", "mhdarslan@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentBy(){
        return new StudentDto(4L,"Arslan", "mhdarslan@gmail.com");
    }
}

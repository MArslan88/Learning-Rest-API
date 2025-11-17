package com.mhdarslan.LearningRestAPIs.service;

import com.mhdarslan.LearningRestAPIs.dto.AddStudentRequestDto;
import com.mhdarslan.LearningRestAPIs.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getAllStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}

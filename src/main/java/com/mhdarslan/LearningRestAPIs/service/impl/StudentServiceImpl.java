package com.mhdarslan.LearningRestAPIs.service.impl;

import com.mhdarslan.LearningRestAPIs.dto.StudentDto;
import com.mhdarslan.LearningRestAPIs.entity.Student;
import com.mhdarslan.LearningRestAPIs.repository.StudentRepository;
import com.mhdarslan.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

//        List<StudentDto> studentDtoList = students.
//                stream().
//                map(student -> new StudentDto(
//                student.getId(),
//                student.getName(),
//                student.getEmail()
//        )).toList();

        List<StudentDto> studentDtoList = students.
                stream().
                map(student -> modelMapper.map(student, StudentDto.class)).toList();

        return studentDtoList;
    }

    @Override
    public StudentDto getAllStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id :"+id));
        StudentDto studentDto = modelMapper.map(student, StudentDto.class);
        return studentDto;
    }
}

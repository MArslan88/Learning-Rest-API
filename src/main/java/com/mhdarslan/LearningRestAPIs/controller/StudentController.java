package com.mhdarslan.LearningRestAPIs.controller;

import com.mhdarslan.LearningRestAPIs.dto.AddStudentRequestDto;
import com.mhdarslan.LearningRestAPIs.dto.StudentDto;
import com.mhdarslan.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;


//    @GetMapping("/students")
    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents(){
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentBy(@PathVariable Long id){
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudentById(id));
        return ResponseEntity.ok(studentService.getAllStudentById(id));
    }

//    @PostMapping("/students")
    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentBy(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudent(id, addStudentRequestDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id, @RequestBody Map<String, Object> updates){
        return ResponseEntity.ok(studentService.updatePartialStudent(id, updates));
    }

}

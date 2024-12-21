package org.scnu.myspringboottest1.controller;

import lombok.RequiredArgsConstructor;
import org.scnu.myspringboottest1.entity.Student;
import org.scnu.myspringboottest1.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping("/class/{className}")
    public List<Student> getStudentsByClassName(@PathVariable String className) {
        return studentService.findByClassName(className);
    }

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        boolean success = studentService.saveStudent(student);
        if (success) {
            return ResponseEntity.ok().body("Student saved successfully");
        } else {
            return ResponseEntity.badRequest().body("Failed to save student");
        }
    }
}
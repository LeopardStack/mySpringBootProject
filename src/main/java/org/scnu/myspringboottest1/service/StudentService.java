package org.scnu.myspringboottest1.service;

import org.scnu.myspringboottest1.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    List<Student> findByClassName(String className);

    // 添加新方法
    boolean saveStudent(Student student);
}

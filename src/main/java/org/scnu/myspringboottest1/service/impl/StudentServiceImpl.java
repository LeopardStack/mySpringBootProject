package org.scnu.myspringboottest1.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.RequiredArgsConstructor;
import org.scnu.myspringboottest1.entity.Student;
import org.scnu.myspringboottest1.mapper.StudentMapper;
import org.scnu.myspringboottest1.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    @DS("slave") // 读操作使用从库
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @DS("slave") // 读操作使用从库
    @Override
    public Student findById(Long id) {
        return studentMapper.findById(id);
    }

    @DS("slave") // 读操作使用从库
    @Override
    public List<Student> findByClassName(String className) {
        return studentMapper.findByClassName(className);
    }

    // 如果有写操作的方法，使用主库
    @DS("master")
    public boolean saveStudent(Student student) {
        return studentMapper.insert(student) > 0;
    }
}
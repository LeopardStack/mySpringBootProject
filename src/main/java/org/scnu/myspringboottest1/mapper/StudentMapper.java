package org.scnu.myspringboottest1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scnu.myspringboottest1.entity.Student;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAll();
    Student findById(Long id);
    List<Student> findByClassName(String className);
    int insert(Student student);  // 添加这个方法
}
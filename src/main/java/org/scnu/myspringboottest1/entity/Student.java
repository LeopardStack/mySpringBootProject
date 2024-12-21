package org.scnu.myspringboottest1.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Student {
    private Long id;
    private String studentNo;
    private String name;
    private String gender;
    private Integer age;
    private String className;
    private Date admissionDate;
    private Double gpa;
    private Date createdAt;
}
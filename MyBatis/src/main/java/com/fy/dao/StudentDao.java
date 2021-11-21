package com.fy.dao;

import com.fy.pojo.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    Student queryOne(int id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}

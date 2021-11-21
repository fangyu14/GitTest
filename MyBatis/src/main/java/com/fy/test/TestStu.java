package com.fy.test;

import com.fy.dao.StudentDao;
import com.fy.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestStu {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream(" SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> list = studentDao.findAll();
        for (Student temp:list){
            System.out.println(temp);
        }
    }




}

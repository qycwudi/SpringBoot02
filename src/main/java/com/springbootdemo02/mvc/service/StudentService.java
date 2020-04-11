package com.springbootdemo02.mvc.service;

import com.springbootdemo02.bean.Student;
import com.springbootdemo02.mvc.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qyc
 * @time 2020/4/9 - 16:08
 */
@Service
public class StudentService{
    @Autowired
    StudentMapper studentMapper;
    public List<Student> selectAll(){
        return studentMapper.selectAll();
    }

    public Student selectId(String id) {
//        int i =Integer.getInteger(id);
//        String num = Integer.toString(i);
        System.out.println(id);
        return studentMapper.selectID(id);
    }
}

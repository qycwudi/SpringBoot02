package com.springbootdemo02.mvc.controller;

import com.springbootdemo02.bean.Student;
import com.springbootdemo02.mvc.mapper.StudentMapper;
import com.springbootdemo02.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qyc
 * @time 2020/4/9 - 16:21
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/show")
    public List showAll(){
        List<Student> list = studentService.selectAll();
        return list;
    }

    @RequestMapping("/id/{idnum}")
    public Student showID(@PathVariable("idnum") String id){

        Student student = studentService.selectId(id);
        return  student;
    }
}

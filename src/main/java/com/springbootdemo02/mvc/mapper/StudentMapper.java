package com.springbootdemo02.mvc.mapper;

import com.springbootdemo02.bean1.People;
import com.springbootdemo02.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qyc
 * @time 2020/4/9 - 15:37
 */
@Mapper
@Repository
public interface  StudentMapper {
    List<Student> selectAll();

    Student selectID(String num);

    List<People> select();
}

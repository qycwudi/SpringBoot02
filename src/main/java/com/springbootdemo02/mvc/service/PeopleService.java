package com.springbootdemo02.mvc.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springbootdemo02.bean1.People;
import com.springbootdemo02.bean.Student;
import com.springbootdemo02.mvc.mapper.StudentMapper;
import com.springbootdemo02.mvc.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PessimisticLockException;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/10 - 12:27
 */
@Service
public class PeopleService {
//    @Autowired
//    private PeopleRepository repository;
    @Autowired
    private StudentMapper studentMapper;
//    public Optional<People> selectId(int id){
//
//        return repository.findById(id);
//    }
//
//    public List<People> selectAll(){
//
//        return repository.findAll();
//    }
//
//    public void insertPeople(People people){
//        repository.save(people);
//    }
//
//    public  void delete(int id){
//        repository.deleteById(id);
//    }
//
//    public void update(People people){
//        repository.saveAndFlush(people);
//    }

//    分页
    public PageInfo page(int num){
        PageHelper.startPage(num,5);
//        List<People> list = repository.findAll();
        List<People> list = studentMapper.select();
        PageInfo pageInfo = new PageInfo<People>(list);

        return pageInfo;
    }
}

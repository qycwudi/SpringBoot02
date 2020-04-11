package com.springbootdemo02.mvc.repository;


import com.springbootdemo02.bean.People;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qyc
 * @time 2020/4/10 - 12:09
 */
public interface PeopleRepository extends JpaRepository<People,Integer> {

}

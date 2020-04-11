package com.springbootdemo02.mvc.controller;

import com.springbootdemo02.bean1.People;
import com.springbootdemo02.mvc.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/10 - 12:33
 */
@RestController
//@Controller
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    //增
//    @PostMapping("/insert")
//    @GetMapping("/insert")
//    public void insert(People people){
//        peopleService.insertPeople(people);
//    }
//
//    //删
////    @DeleteMapping("delete/{id}")
//    @GetMapping("delete/{id}")
//    public void delete(@PathVariable("id") Integer id){
//        peopleService.delete(id);
//    }
//    //改
////    @PutMapping("/update")
//    @GetMapping("/update")
//    public void update(People people){
//        peopleService.update(people);
//    }
//    //查
//    @GetMapping("/selectAll")
//    public List<People> selectAll(){
//        return peopleService.selectAll();
//    }

//    @GetMapping("/selectId/{id}")
//    public Optional<People> selectAll(@PathVariable("id") Integer id){
//        return peopleService.selectId(id);
//    }

    @GetMapping("/pageInfo/{num}")
    public List<People> page(@PathVariable("num") Integer num, HttpServletRequest request){

        List<People> list = peopleService.page(num).getList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        request.getSession().setAttribute("plist",list);

        return list;
    }

}

package com.springbootdemo02.bean;

import javax.persistence.*;

/**
 * @author qyc
 * @time 2020/4/10 - 12:13
 */
@Entity
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "list_name")
    private String list_name;

    public People() {
    }

    public People(Integer id, String list_name) {
        this.id = id;
        this.list_name = list_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", list_name='" + list_name + '\'' +
                '}';
    }
}

package com.springbootdemo02.bean1;

/**
 * @author qyc
 * @time 2020/4/10 - 15:25
 */

public class People {
    private int id;
    private String list_name;

    public People(int id, String list_name) {
        this.id = id;
        this.list_name = list_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

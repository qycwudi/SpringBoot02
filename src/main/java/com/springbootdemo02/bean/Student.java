package com.springbootdemo02.bean;

/**
 * @author qyc
 * @time 2020/4/9 - 15:48
 */
public class Student {
    private String classid;
    private String classname;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classid='" + classid + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }

    public Student(String classid, String classname) {
        this.classid = classid;
        this.classname = classname;
    }
}

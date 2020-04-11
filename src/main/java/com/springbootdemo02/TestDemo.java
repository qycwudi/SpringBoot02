package com.springbootdemo02;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @author qyc
 * @time 2020/4/9 - 17:14
 */
public class TestDemo {
    public static void main(String[] args) {
        String a = "123";
        int i = Integer.parseInt(a.toString());

        String j = String.valueOf(i);
        System.out.println(i+"  ");
        System.out.println(j+"  ");
    }
}

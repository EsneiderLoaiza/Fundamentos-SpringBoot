package com.fundamentosplatzi.springboot.fundamentos.bean.impl;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.printf("Hi from my implement own of bean");
    }
}

package com.fundamentosplatzi.springboot.fundamentos.bean.impl;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperation;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 10;
        System.out.println("Sum is: "+myOperation.sum(number));
        System.out.printf("Hello from implement of a bean with dependency");
    }
}

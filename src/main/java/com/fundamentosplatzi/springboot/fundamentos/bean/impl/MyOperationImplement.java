package com.fundamentosplatzi.springboot.fundamentos.bean.impl;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperation;

public class MyOperationImplement implements MyOperation {
    @Override
    public int sum(int number) {
        return number+1;
    }
}

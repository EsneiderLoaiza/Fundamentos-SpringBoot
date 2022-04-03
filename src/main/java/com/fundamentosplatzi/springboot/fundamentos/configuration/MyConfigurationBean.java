package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.bean.impl.MyBeanTwoImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.impl.MyBeanWithDependencyImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.impl.MyOperationImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beanOperationSum() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationSumWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }
}

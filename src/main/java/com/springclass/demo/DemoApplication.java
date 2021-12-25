package com.springclass.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("setterInject.xml");
        SetterInject setterInject = (SetterInject) context.getBean("student");
        System.out.println(setterInject);
    }

}

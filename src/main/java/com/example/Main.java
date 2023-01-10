package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("employee-config.xml");
//
//        Employee em = (Employee) context.getBean("employee");
//
//        System.out.println(em);

        ApplicationContext context = new ClassPathXmlApplicationContext("person-config.xml");

        Person p = context.getBean("person", Person.class);

        System.out.println(p);

    }
}

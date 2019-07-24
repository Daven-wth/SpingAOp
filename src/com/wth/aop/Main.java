package com.wth.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wth on 2019/7/24.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("spring-aop.xml");
        Performer performer =(Performer) context.getBean("lang");
        performer.perform();

    }
}

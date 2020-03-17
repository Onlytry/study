package com.dz.spring;

import org.springframework.stereotype.Component;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/11 9:10
 */
@Component("log")
public class Log {

    public void before(){
        System.out.println("----before---");
    }
    public void after(){
        System.out.println("---after---");
    }
}

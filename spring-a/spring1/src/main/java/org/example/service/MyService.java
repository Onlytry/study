package org.example.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/2/27 9:32
 */
@Aspect
public class MyService {
    @Before("org.example.TestAop.test()")
    public  void before(){
        System.out.println("woxianzhixing");
    }
    @After("org.example.TestAop.test()")
    public void after(){
        System.out.println("after---");
    }
}

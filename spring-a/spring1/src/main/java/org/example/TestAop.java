package org.example;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Hello world!
 *
 */
public class TestAop {
     @Pointcut("execution(* org.example.*.*(..))")
    public void test(){
        System.out.println("haha");
    }

    public static void main(String[] args) {
            String a = "a";
            String b = "a";
        String c = new String("a");
        String d = new String("a");
        System.out.println(c==d);
        System.out.println(a==c);

    }
}

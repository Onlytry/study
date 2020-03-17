package com.dz.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @auther D Z
 * @date 2020/3/14 15:33
 */
public class Test6 {
    public static void main(String[] args) throws InterruptedException {
       // CyclicBarrier()
        CountDownLatch downLatch = new CountDownLatch(5);
        for (int i = 1; i <= 5; i++) {
            new Thread(()->{
                A.say();
                downLatch.countDown();
            }).start();
        }
        downLatch.await();
        System.out.println("haha");
    }
}
class A{
    public static void say(){
        System.out.println("say---");
    }
}

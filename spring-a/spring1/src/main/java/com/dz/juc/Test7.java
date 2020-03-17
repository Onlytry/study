package com.dz.juc;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @auther D Z
 * @date 2020/3/15 10:35
 */
public class Test7 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                            TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"离开车 位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }
    }
}

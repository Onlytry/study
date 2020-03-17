package com.dz.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther D Z
 * @date 2020/3/14 13:47
 */
public class Test4 {
    public static void main(String[] args) {
        Factory1 factory = new Factory1();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    factory.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "A").start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    factory.del();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "C").start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    factory.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "D").start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    factory.del();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "B").start();
        }

    }
}


class Factory1 {
    private int num = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    Condition conEmpty  = lock.newCondition();

    public  void add() throws InterruptedException {
        lock.lock();
        try {
            while (num != 0) {
                condition.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName()+"添加" + num);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public  void del() throws InterruptedException {
        lock.lock();
        try {
            while (num == 0) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"减少" + num);
            num--;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
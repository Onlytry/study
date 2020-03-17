package com.dz.juc;

/**
 * @auther D Z
 * @date 2020/3/14 13:21
 */
public class Test3 {
    public static void main(String[] args) {
        Factory factory = new Factory();
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
            }, "B").start();
        }
    }
}

class Factory {
    private int num = 0;

    public synchronized void add() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        num++;
        System.out.println("添加" + num);
        this.notifyAll();
    }

    public synchronized void del() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        System.out.println("减少" + num);
        num--;
        this.notifyAll();
    }
}
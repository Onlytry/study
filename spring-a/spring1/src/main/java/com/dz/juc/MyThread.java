package com.dz.juc;

/**
 * @auther D Z
 * @date 2020/3/14 11:09
 */
public class MyThread {
    /*线程的几种状态
NEW, RUNNABLE BLOCKED,WAITING TIMED_WAITING, TERMINATED;
    * */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
           final int temp  =i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"--->"+temp);
            }).start();

            MyThread myThread = new MyThread();

        }
    }
}

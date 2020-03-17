package com.dz.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther D Z
 * @date 2020/3/14 13:03
 */
public class Test2 {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();
        for (int i = 0; i < 20; i++) {
            new Thread(
                    ()->{
                        for (int i1 = 0; i1 < 10; i1++) {
                            ticket.sale();
                        }
                    }
            ).start();
        }
    }
}


class Ticket1{
    private static volatile int ticket = 50;
  private Lock lock = new ReentrantLock();
    public  synchronized   void sale(){
        lock.lock();
        try {
            if(ticket>0) {
                ticket--;
                System.out.println(ticket);
                System.out.println("-----");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();

        }

    }
}

//    Synchronized 和 Lock 区别
/*           Synchronized                  Lock
*     syn 可以锁方法或者同步代码块    lock 锁的是方法内部
*       无法判断锁的状态                 可以
*
*
*
* */
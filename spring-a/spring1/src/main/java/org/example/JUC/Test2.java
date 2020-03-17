package org.example.JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/9 13:46
 */
public class Test2 {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }).start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }).start();
        new Thread(() -> { for (int i = 0; i < 30; i++) ticket.sale(); }).start();


    }
}


class Ticket1 {
    private int ticket = 60;
   Lock lock  = new ReentrantLock();
    public  void sale() {
        lock.lock();
        try {
            if (ticket > 0) {
                System.out.println("卖了第" + (ticket--) + "张" + "," + "剩余" + ticket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

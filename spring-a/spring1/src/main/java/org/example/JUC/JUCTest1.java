package org.example.JUC;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/9 13:46
 */
public class JUCTest1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket.sale();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket.sale();
            }
        }).start();

    }
}


class Ticket {
    private int ticket = 60;

    public synchronized void sale() {
        if (ticket > 0) {
            System.out.println("卖了第" + (ticket--) + "张" + "," + "剩余" + ticket);
        }
    }
}

package org.example.JUC;

import java.awt.event.MouseWheelListener;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/9 14:29
 */

//生产者消费者问题
public class Test3 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    shop.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    shop.del();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

class Shop{
    int number =0;
    public synchronized void add() throws InterruptedException {
        while (number!=0){
            this.wait();
        }
        number++;
        System.out.println(number);
        this.notifyAll();
    }
    public synchronized void del() throws InterruptedException {
        while (number==0){
            this.wait();
        }
        number--;
        System.out.println(number);
        this.notifyAll();
    }
}

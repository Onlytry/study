package com.dz.juc;

/**
 * @auther D Z
 * @date 2020/3/14 11:19
 */
public class Test1 {
    public static void main(String[] args) {

    }


    public static  void sale1(){
        Ticket ticket = new Ticket();
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



class Ticket{
    private static volatile int ticket = 100;

    public  synchronized   void sale(){
        if(ticket>0) {
            ticket--;
            System.out.println(ticket);
            System.out.println("-----");
        }else {
            System.out.println("票买光了");
        }

    }
}
package com.dz.sort;

/**
 * @auther D Z
 * @date 2020/3/12 12:45
 */
public class 希尔排序 {
    public static void main(String[] args) {


    }
}

class Single{
    private static Single single;
    //    private static Single single = new Single();   饿汉式
    private Single(){}

    private static Single getInstance1(){
        if (single==null){
            synchronized (Single.class){
                if (single==null){
                single = new Single();

                }
            }
        }
        return  single;
    }




    //多线程不安全
    private static Single getInstance(){
        if (single==null){
            single = new Single();
        }
        return  single;
    }

}

enum Sing{
    NEWINTANCE;
}
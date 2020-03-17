package com.dz.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @auther D Z
 * @date 2020/3/14 14:46
 */
public class Test5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThred thred = new MyThred();
        FutureTask futureTask = new FutureTask(thred);

            new Thread(futureTask).start();
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start(); // 结果会被缓存，效率高
        Integer o = (Integer) futureTask.get(); //这个get 方法可能会产生阻塞！把他放到
        System.out.println(o);

    }
}
class MyThred implements Callable{
    @Override
    public Integer call() throws Exception {
        System.out.println("hahahaa");
        return 1024;
    }
}
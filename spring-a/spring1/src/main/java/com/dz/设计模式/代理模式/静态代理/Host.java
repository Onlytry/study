package com.dz.设计模式.代理模式.静态代理;

import com.dz.设计模式.代理模式.动态代理.RentHouse;

/**
 * @auther D Z
 * @date 2020/3/16 8:47
 */
public class Host implements RentHouse {
    @Override
    public void rent() {
        System.out.println("我要出租房子");
    }
}

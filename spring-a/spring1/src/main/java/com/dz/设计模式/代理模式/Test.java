package com.dz.设计模式.代理模式;

import com.dz.设计模式.代理模式.动态代理.ProxyInvocationhandler;
import com.dz.设计模式.代理模式.动态代理.RentHouse;
import com.dz.设计模式.代理模式.静态代理.Host;
import com.dz.设计模式.代理模式.静态代理.Proxy;

/**
 * @auther D Z
 * @date 2020/3/16 8:48
 */
public class Test {
    public static void main(String[] args) {
        Host host = new Host();
//        Proxy proxy = new Proxy(host);
//        proxy.seeHouse();
//        proxy.rent();

        ProxyInvocationhandler handler = new ProxyInvocationhandler();
             handler.setRentHouse(host);
        RentHouse proxy = (RentHouse) handler.getProxy();
        proxy.rent();

    }
}

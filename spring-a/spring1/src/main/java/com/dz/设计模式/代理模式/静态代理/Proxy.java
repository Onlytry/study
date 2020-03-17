package com.dz.设计模式.代理模式.静态代理;

/**
 * @auther D Z
 * @date 2020/3/16 8:48
 */
public class Proxy implements RentHouse {
    private Host host;

    public Proxy(Host host){
        this.host = host;
    }
    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("我要看房子");
    }
}

package com.dz.设计模式.工厂方法;

/**
 * @auther D Z
 * @date 2020/3/15 15:01
 */
public class WuFactory implements CarFactory {
    @Override
    public Car getCar() {

        return  new WuLi();
    }
}

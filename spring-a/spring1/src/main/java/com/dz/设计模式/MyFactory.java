package com.dz.设计模式;

import com.dz.设计模式.工厂方法.WuFactory;
import com.dz.设计模式.简单工厂.Car;
import com.dz.设计模式.简单工厂.Simlefactory;

/**
 * @auther D Z
 * @date 2020/3/15 14:21
 */
public class MyFactory {
    public static void main(String[] args) {
        Car car = Simlefactory.getCar("wuli");
        car.name();

        com.dz.设计模式.工厂方法.Car car1 = new WuFactory().getCar();
        car1.name();
    }
}

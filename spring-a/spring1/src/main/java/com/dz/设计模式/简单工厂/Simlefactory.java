package com.dz.设计模式.简单工厂;

/**
 * @auther D Z
 * @date 2020/3/15 14:47
 */
public class Simlefactory {

    public  static  Car getCar(String name){
        if (name.equals("wuli")){
            return new WuLi();
        }else if(name.equals("tsl")){
            return  new Tsl();
        }else {
            return null;
        }
    }
}

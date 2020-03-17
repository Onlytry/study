package com.dz.设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther D Z
 * @date 2020/3/16 9:49
 */
public class ProxyInvocationhandler implements InvocationHandler {
    private RentHouse rentHouse;

    public void setRentHouse(RentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }
      public Object getProxy(){
          Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                  rentHouse.getClass().getInterfaces(), this);
          return  proxy;
      }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(rentHouse, args);
        return invoke;
    }
}

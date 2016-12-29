/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Administrator
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object obj;
    
    public MyInvocationHandler(Object obj) {
           this.obj = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           before();
           Object result = method.invoke(obj, args);
           after();
           return result;
    }
    
    public void before() {
           System.out.println("ready go……");
    }
    public void after() {
           System.out.println("finish……");
    }

}

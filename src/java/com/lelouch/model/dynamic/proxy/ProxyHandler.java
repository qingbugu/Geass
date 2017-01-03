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
public class ProxyHandler implements InvocationHandler{
    //　这个就是我们要代理的真实对象
    private Object subject;

    public ProxyHandler(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
        before();
        
        System.out.println("Method:" + method);
        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object invoke = method.invoke(subject, args);
        
        //　　在代理真实对象后我们也可以添加一些自己的操作
        after();
        
        return invoke;
    }
    
    
    public void before(){
       System.out.println("before do something"); 
    }
    
    public void after(){
        System.out.println("after do something");
    }
}

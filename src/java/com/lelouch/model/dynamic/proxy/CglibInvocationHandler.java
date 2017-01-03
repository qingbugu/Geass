/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *
 * @author Administrator
 */
public class CglibInvocationHandler implements MethodInterceptor{
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] os, MethodProxy mp) throws Throwable {
        System.out.println("事务开始");  
        mp.invokeSuper(o, os);  
        System.out.println("事务结束");  
        return null;  
    }
    
    public Object getProxyInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();
    }
}

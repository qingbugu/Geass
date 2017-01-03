/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *
 * @author Administrator
 */
public class DynamicProxy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BookFacade obPName = new BookFacadeImpl();
              /*处理器实例*/
//        MyInvocationHandler obMIHandler = new MyInvocationHandler(obPName);
        MyInvocationHandler obMIHandler = new MyInvocationHandler();
        
        /*代理实例*/
        BookFacade bookProxy = (BookFacade)obMIHandler.bind(obPName);
        
        System.out.println("代理类："+bookProxy.getClass().getName());
        /*代理实例应用*/
        bookProxy.addBook();
        long endTime = System.currentTimeMillis();
        
        System.out.println("运行时间："+(endTime - startTime)+"ms");
    /***********************************************/   
    
         //    我们要代理的真实对象
//        Subject realSubject = new RealSubject();
//
//        //    我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
//        InvocationHandler handler = new ProxyHandler(realSubject);
//
//        /*
//         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
//         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
//         * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
//         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
//         */
//        Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
//                .getClass().getInterfaces(), handler);
//        
//        System.out.println(subject.getClass().getName());
//        subject.rent();
//        subject.hello("world");

//        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
//        for(Class c : interfaces){
//            System.out.println(c.getCanonicalName());
//        }
//        RealSubject realSubject = new RealSubject();
//        ProxyHandler handler = new ProxyHandler(realSubject);  //代理类的操作类，需要传入要代理的真实对象
//        Subject newProxyInstance = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
//        System.out.println(newProxyInstance.getClass().getName());
//        newProxyInstance.rent();
//        newProxyInstance.hello("zhang san");
        
    }
}

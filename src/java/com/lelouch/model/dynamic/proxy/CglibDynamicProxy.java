/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

/**
 *
 * @author Administrator
 */
public class CglibDynamicProxy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        CglibInvocationHandler handler = new CglibInvocationHandler();
        
        BookFacadeCglibImpl proxyInstance = (BookFacadeCglibImpl)handler.getProxyInstance(new BookFacadeCglibImpl());
        
        System.out.println("代理类："+proxyInstance.getClass().getName());
        /*代理实例应用*/
        proxyInstance.addBook();
        long endTime = System.currentTimeMillis();
        
        System.out.println("运行时间："+(endTime - startTime)+"ms");
    }
}

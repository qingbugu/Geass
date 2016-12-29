/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 *
 * @author Administrator
 */
public class DynamicProxy {
    public static void main(String[] args) {
        PrintName obPName = new PrintName();
              /*处理器实例*/
        MyInvocationHandler obMIHandler = new MyInvocationHandler(obPName);
        /*代理实例*/
        Name obName = (Name) Proxy.newProxyInstance(obPName.getClass().getClassLoader(),obPName.getClass().getInterfaces(), obMIHandler);
        /*代理实例应用*/
        obName.setName("xuemaxiongfeng");
        //obName.printName();
        obPName.printName();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        String name = obName.getName();
        System.out.println(name);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.dynamic.proxy;

import com.lelouch.model.dynamic.proxy.Name;

/**
 *
 * @author Administrator
 */
public class PrintName implements Name{
    private String name;
    
    public void setName(String name) {
           this.name = name;
    }
    public String getName() {
           //printName();
           return name;
    }
    
    public void printName() {
           System.out.println("The name is : " + name);
    }
}

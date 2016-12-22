/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.fruit;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
/**
 * 
 * @author Administrator
 */
public class Apple{
    private String code; //条形码

    public Apple(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Apple{" + "code=" + code + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
    
    @Override
    public boolean equals(Object obj){
        System.out.println("enter equals method...");
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        final Apple apple = (Apple)obj;
        if(!this.code.equals(apple.code)){
            return false;
        }
        return true;
    }
    
//    @Override
//    public int hashCode(){
//        System.out.println("enter hash method...");
//        System.out.println("hash:"+ this.code);
//        return this.code.hashCode();
//    }

    @Override
    public int hashCode() {
        System.out.println("enter hash method...");
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.code);
        System.out.println("hash:"+ this.code);
        return hash;
    }
    
    
    
    public static void main(String[] args){
        Apple apple1 = new Apple("001");
        Apple apple2 = new Apple("001");
        
        
        Collection c = new HashSet();
        c.add(apple1);
        System.out.println("------------");
        c.add(apple2);
        System.out.println("------------");
        apple2.setCode("001");
        Apple apple3 = apple2;
        c.add(apple3);
        System.out.println("------------");
//        System.out.println(apple1.equals(apple2));
//        System.out.println("------------");
//        System.out.println(apple1.hashCode());
//        System.out.println(apple2.hashCode());
        System.out.println(c.toString());
    }
}

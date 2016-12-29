/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.proxy;

import com.lelouch.service.proxy.Sellable;


/**
 * 具体主题角色
 * @author Administrator
 */
public class Press implements Sellable{

    @Override
    public String sellBook() {
        System.out.println("I am a Press, Publication of books.You can get a book from here at last.");
        return "book";
    }
    
}

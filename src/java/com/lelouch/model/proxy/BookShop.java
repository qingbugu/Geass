/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.proxy;

import com.lelouch.service.proxy.Sellable;

/**
 *
 * @author Administrator
 */
public class BookShop implements Sellable{
    private final Sellable sellable;

    public BookShop() {
        sellable = new BookShop();
    }

    public BookShop(Sellable sellable) {
        this.sellable = sellable;
    }
    
    @Override
    public String sellBook() {
        System.out.println("I am a bookshop.You can buy book from me after the Press publishs it.");
        return sellable.sellBook();
    }
    
}

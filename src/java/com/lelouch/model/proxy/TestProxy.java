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
public class TestProxy {
//    public String books() {
//        //这就好像我们从书店获得书本，而实际出版社才是出版书本的地方
//        BookShop ob_aBookShop = new BookShop();
//        //Interface in_aInterface = new Press();
//        // BookShop ob_aBookShop = new BookShop(in_aInterface);
//        return ob_aBookShop.sellBook();
//     }
     public static void main(String[] args) {
//        TestProxy ob_aTestProxy = new TestProxy();
        
//        BookShop ob_aBookShop = new BookShop();
        Sellable s = new Press();
        BookShop ob_aBookShop = new BookShop(s);
        //Interface in_aInterface = new Press();
        // BookShop ob_aBookShop = new BookShop(in_aInterface);
        
        System.out.println("I buy a book : " + ob_aBookShop.sellBook());
     }
}

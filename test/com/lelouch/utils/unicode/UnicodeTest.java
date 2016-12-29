/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.utils.unicode;

import static com.lelouch.utils.unicode.UnicodeUtils.unicode2String;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class UnicodeTest {
    UnicodeUtils unicodeUtils = null;
    StringBuilder sb = null;
    
    public UnicodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        unicodeUtils = new UnicodeUtils();
        sb = new StringBuilder();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
//        String test = "最代码网站地址:www.zuidaima.com";  
        String test = "导";  
   
        String unicode = unicodeUtils.string2Unicode(test);  

//        String string = unicodeUtils.unicode2String(unicode) ;  

        System.out.println(unicode);  

//        System.out.println(string);  
//        StringBuffer sb = new StringBuffer();
//        char a = '\u6211';
//        byte[] charToByte = UnicodeUtils.charToByte(a);
//        for(byte b:charToByte){
//            sb.append(b);
//        }
//        System.out.println(sb); 
        
//        char c = (char) -3; // char不能识别负数，必须强制转换否则报错，即使强制转换之后，也无法识别  
//        System.out.println(c); 
//        
//        byte b = (byte)128;
//        System.out.println(b); 
//        
//        byte f= (byte) '我';
//        System.out.println(f); 
        
//        byte g = 'b';   //b对应ASCII是98  
//        char h = (char) g;  
//        char i = 85;    //U对应ASCII是85  
//        int j = 'h';    //h对应ASCII是104  
//        System.out.println(g);  
//        System.out.println(h);  
//        System.out.println(i);  
//        System.out.println(j); 
        
        //1、将字符转换成byte数组
//        String  str = "我们";
//        byte[] bytes = str.getBytes();
//        for(byte b:bytes){
//            sb.append(b);
//        }
//        System.out.println(sb); 
//        int a = 0x4;
//        System.out.println(a); 
    }
    
}

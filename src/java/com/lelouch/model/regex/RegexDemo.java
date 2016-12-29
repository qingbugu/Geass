/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class RegexDemo {
    public static void main(String[] args) {
        /**
         * 1.
         */
        // 要验证的字符串  
        String str = "程序设计协会";  
        // 正则表达式规则  
        String strRegex = "程序.*";  
        // 编译正则表达式  
        Pattern pattern = Pattern.compile(strRegex);  
        //创建匹配器  
        Matcher matcher = pattern.matcher(str);  
        // 查找字符串中是否有匹配正则表达式的 字符/字符串  
        boolean rs = matcher.matches();  
//        System.out.println(rs);  
        
        System.out.println(str.matches(strRegex));
        //  matcher有 lookingAt方法   从头开始只要找到匹配就返回true
        //  find   任意位置匹配的话返回true
        // group    指匹配到的字符串
        
         /**
         * 2.
         */
        String[] fakeFileData = {   
            "abc/def/ghi",   
            "jkl/mno/pqr" };   
        Pattern p = Pattern.compile("/");  
        for(String data : fakeFileData) {   
            String[] tokens = p.split(data);   
            for(String token : tokens) {   
                System.out.print(token+" ");  
            }   
            System.out.println();   
        }
        
        
//        boolean matches = Pattern.matches("^\\d{1,}$","5152313");
//        boolean matches = Pattern.matches("^[\\u4e00-\\u9fa5]{0,}$","我去"); //匹配汉字
//        boolean matches = Pattern.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$","w.ww@dg.cn"); //匹配邮箱
        boolean matches = Pattern.matches("^\\d{4}-\\d{1,2}-\\d{1,2}","2015-55-53"); //匹配日期    有问题
        System.out.println(matches); 
        
    }   
}

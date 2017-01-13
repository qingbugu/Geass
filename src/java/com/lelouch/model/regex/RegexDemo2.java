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
public class RegexDemo2 {
    public static void main(String[] args) {  
//        String s = "abc123def456ghi789";  
//        String sRegex = "\\d+";  
////        Pattern p = Pattern.compile(sRegex);
////        Matcher matcher = p.matcher(s);
////        while(matcher.find()){
////            int start = matcher.start();
////            int end = matcher.end();
////            String str = matcher.group();
////            System.out.println("开始位置："+start+",结束位置："+end+",查找到的字符串："+str);
////            s = s.replace(matcher.group(), "替换后的内容");  
////        }
//        Pattern p = Pattern.compile(sRegex);
//        Matcher matcher = p.matcher(s);
//        
//            int count = 0;
//            String regEx = "[\\u4e00-\\u9fa5]";
//            // System.out.println(regEx);
//            String str = "Internet 网络 is 真好 very  good ^_^!";
//            // System.out.println(str);
////            Pattern p = Pattern.compile(regEx);
////            Matcher m = p.matcher(str);
//            System.out.print("提取出来的中文有：");
////            while (m.find()) {
////             System.out.print(m.group(0)+" ");
////            }
//            System.out.println();
//            System.out.println(p.matches(regEx, "中"));
//            System.out.println(p.matches(regEx, "a"));
            String dateStr = "2016/12/32";
            String phoneStr = "14831321223";
            System.out.println(RegexUtils.isPhone(phoneStr));
        
    }  
}

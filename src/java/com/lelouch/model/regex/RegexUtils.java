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
public class RegexUtils {
//    public static final String REGEX_DATE = "^(?:(?:1[6-9]|[2-9][0-9])[0-9]{2}([-/.]?)(?:(?:0?[1-9]|1[0-2])\\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\\1(?:29|30)|(?:0?[13578]|1[02])\\1(?:31))|(?:(?:1[6-9]|[2-9][0-9])(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00)([-/.]?)0?2\\2(?:29))$";
    public static final String REGEX_DATE = "^(?:(?:1[6-9]|[2-9][0-9])[0-9]{2}([/])(?:(?:0?[1-9]|1[0-2])\\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\\1(?:29|30)|(?:0?[13578]|1[02])\\1(?:31))|(?:(?:1[6-9]|[2-9][0-9])(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00)([/])0?2\\2(?:29))$";
    
    public static final String REGEX_PHONE = "^(0[0-9]{2,3}\\-)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?$|(^(13[0-9]|15[0|3|6|7|8|9]|18[8|9])\\d{8}$)";
    
    public static boolean isDate(String str){
        Pattern pattern = Pattern.compile(REGEX_DATE);
        //创建匹配器  
        Matcher matcher = pattern.matcher(str);  
        
        return matcher.matches();
    }

    public static boolean isPhone(String str){
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        //创建匹配器  
        Matcher matcher = pattern.matcher(str);  
        
        return matcher.matches();
    }
    
}

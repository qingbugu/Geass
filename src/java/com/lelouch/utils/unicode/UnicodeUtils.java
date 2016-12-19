/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.utils.unicode;

import java.lang.annotation.Native;

/**
 *
 * @author Administrator
 */
public class UnicodeUtils {
    @Native public static final int SIZE = 32;
    
    final static char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
    
        /**
     * Format a long (treated as unsigned) into a character buffer.
     * @param val the unsigned int to format
     * @param shift the log2 of the base to format in (4 for hex, 3 for octal, 1 for binary)
     * @param buf the character buffer to write to
     * @param offset the offset in the destination buffer to start at
     * @param len the number of characters to write
     * @return the lowest character  location used
     */
     static int formatUnsignedInt(int val, int shift, char[] buf, int offset, int len) {
        int charPos = len;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            buf[offset + --charPos] = UnicodeUtils.digits[val & mask];
            val >>>= shift;
        } while (val != 0 && charPos > 0);

        return charPos;
    }
    
        /** 
     * 字符串转换unicode 
     */  
    public static String string2Unicode(String string) {  

        StringBuffer unicode = new StringBuffer();  

        for (int i = 0; i < string.length(); i++) {  

            // 取出每一个字符  
            char c = string.charAt(i);  

            // 转换为unicode  
            unicode.append("\\u" + toHexString(c));  
        }  

        return unicode.toString();  
    }  
    
        /** 
     * unicode 转字符串 
     */  
    public static String unicode2String(String unicode) {  

        StringBuffer string = new StringBuffer();  

        String[] hex = unicode.split("\\\\u");  

        for (int i = 1; i < hex.length; i++) {  

            // 转换出每一个代码点  
            int data = Integer.parseInt(hex[i], 16);  

            // 追加成string  
            string.append((char) data);  
        }  

        return string.toString();  
    }  
    
    public static String toHexString(int i) {
        return toUnsignedString0(i, 4);
    }
    
        /**
     * Convert the integer to an unsigned number.
     */
    private static String toUnsignedString0(int val, int shift) {
        // assert shift > 0 && shift <=5 : "Illegal shift value";
        int mag = UnicodeUtils.SIZE - numberOfLeadingZeros(val);
        int chars = Math.max(((mag + (shift - 1)) / shift), 1);
        char[] buf = new char[chars];

        formatUnsignedInt(val, shift, buf, 0, chars);

        // Use special constructor which takes over "buf".
        return new String(buf);
//        return new String(buf, true);
    }
    
    
    public static int numberOfLeadingZeros(int i) {
        // HD, Figure 5-6
        if (i == 0)
            return 32;
        int n = 1;
        if (i >>> 16 == 0) { n += 16; i <<= 16; }
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }
        n -= i >>> 31;
        return n;
    }
    
    //char转化为byte：
    public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[0] = (byte) ((c & 0xFF00) >> 8);
        b[1] = (byte) (c & 0xFF);
        return b;
    }
}

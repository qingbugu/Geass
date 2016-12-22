/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class ShowClassInfo {
    
    static public void printInfo(Class c) {
        System.out.println("Class Name:" + c.getName() + " is interface? ["
                + c.isInterface() + "]");
        System.out.println("Simple Name:" + c.getSimpleName());
        System.out.println("Canonical Name:" + c.getCanonicalName());
    }
    
    public static void main(String[] args){
        Class c = null;
        
        try {
            c = Class.forName("com.lelouch.model.rtti.BaishiCoke");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowClassInfo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Can't find the class!!");  
            System.exit(1);  
        }
        
        printInfo(c);  
          
        for(Class face : c.getInterfaces()){  
            printInfo(face);  
        }  
    }
    

//    private static String usage
//            = "usage:\n"
//            + "ShowMethods qualified.class.name\n"
//            + "To Show all methods in class or:\n"
//            + "ShowMethods qualified.class.name word\n"
//            + "To Search for methods involving 'word'";
//    public String str = "public string";
//    private static Pattern p = Pattern.compile("\\w+\\.");
//    //表示过滤掉前面的命名修饰，如果用下面的可以看到完整的命名  
//    //private static Pattern p = Pattern.compile("\\W+\\.");  
//
//    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.print(usage);
//            System.exit(0);
//        }
//        int lines = 0;
//        try {
//            Class<?> c = Class.forName(args[0]);
//            //使用下面的类字面常量则不用try catch语句  
//            //Class<?> c = ShowClassInformation.class  
//            Method[] methods = c.getMethods();
//            Constructor[] ctors = c.getConstructors();
//            Field[] fields = c.getFields();
//
//            /* 如果需要设置属性值使用setXXX方法 
//             * 调用方法可以使用Invoke方法 
//             */
//            if (args.length == 1) {
//                System.out.println(args[0] + " Methods:");
//                for (Method method : methods) {
//                    System.out.println(p.matcher(method.toString()).replaceAll(""));
//                }
//                System.out.println();
//
//                System.out.println(args[0] + " Constructors:");
//                for (Constructor ctor : ctors) {
//                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
//                }
//                System.out.println();
//
//                System.out.println(args[0] + " Fields:");
//                for (Field field : fields) {
//                    System.out.println(p.matcher(field.toString()).replaceAll(""));
//                }
//                System.out.println();
//
//                lines = methods.length + ctors.length + fields.length;
//            } else {
//                System.out.println(args.length + " Methods:");
//                for (Method method : methods) {
//                    if (method.toString().indexOf(args[1]) != -1) {
//                        System.out.println(p.matcher(method.toString()).replaceAll(""));
//                        lines++;
//                    }
//                }
//                for (Constructor ctor : ctors) {
//                    if (ctor.toString().indexOf(args[1]) != -1) {
//                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
//                        lines++;
//                    }
//                }
//                for (Field field : fields) {
//                    if (field.toString().indexOf(args[1]) != -1) {
//                        System.out.println(p.matcher(field.toString()).replaceAll(""));
//                    }
//                }
//            }
//        } catch (ClassNotFoundException e) {
//            System.out.println("No such class:" + e);
//        }
//    }
}

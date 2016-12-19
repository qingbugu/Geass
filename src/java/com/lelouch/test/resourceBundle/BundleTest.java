/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.test.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class BundleTest {

    public static final String PROPERTIES_FILE_NAME = "property";
    public static final String MY_NAME_KEY = "name";
    public static final String MY_VALUE_KEY = "value";

    private static String myName;
    private static String myValue;

    static {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(PROPERTIES_FILE_NAME, new Locale("zh","CN"));
            myName = bundle.getString(MY_NAME_KEY).trim();
            myValue = bundle.getString(MY_VALUE_KEY).trim();
        } catch (Exception ex) {
            System.err.println("[Property]:Can't Load property.properties");
            myName = "default name";
            myValue = "default value";
            System.out.println("myName will use the default value: " + myName);
            System.out.println("myValue will use the default value: " + myValue);
        }
    }

    public void print() {
        System.out.println("My name is: " + myName);
        System.out.println("My value is: " + myValue);
    }

    public static void main(String[] args) {
        BundleTest test = new BundleTest();
        test.print();
    }
}

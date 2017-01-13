/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.serial;

import com.lelouch.model.student.Person;
import com.lelouch.model.student.Person.Gender;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Administrator
 */
public class SerialDemo {

    public static void main(String[] args) throws Exception {
//        File file = new File("person.out");  
// 
//        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));  
//        Person person = new Person("John", 101, Gender.MALE);  
//        oout.writeObject(person);  
//        oout.close();  
// 
//        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  
//        Object newPerson = oin.readObject(); // 没有强制转换到Person类型  
//        oin.close();  
//        System.out.println(newPerson);  
        File path = new File("f:/");
        if (path.exists() == false) {
            if (path.mkdirs() == false) {
                throw new IOException("mkdir error");
            }
        }
        String fileName = "person.txt";
        File file = new File(path, fileName);
        if (file.exists() == false) {
            file.createNewFile();
        }
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 20, Gender.MALE);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型  
        if (newPerson instanceof Person) {
            System.out.println("类型正确");
        }
        oin.close();
        System.out.println(newPerson);
    }
}

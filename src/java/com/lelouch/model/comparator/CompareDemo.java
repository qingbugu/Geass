/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.comparator;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class CompareDemo {

    public static void main(String[] args) {
        List userlist = new ArrayList();
        userlist.add(new User("bb", 4));
        userlist.add(new User("aa", 1));
        userlist.add(new User("ee", 5));
        userlist.add(new User("bd", 2));
        userlist.add(new User("张三", 5));
        userlist.add(new User("张一", 3));
        userlist.add(new User("李四", 6));

        Collections.sort(userlist, new Comparator<User>() {
//            private final Collator instance = Collator.getInstance(); 
            @Override
            public int compare(User o1, User o2) {
//                int flag = o1.getAge() - o2.getAge();
//                if (flag == 0) {
//                    return o1.getName().compareToIgnoreCase(o2.getName());   //这种是按编码来的
//                } else {
//                    return flag;
//                }
                return  Collator.getInstance(Locale.SIMPLIFIED_CHINESE).compare(o1.getName(), o2.getName()); //这种是按 汉字的首字母来
//                return instance.compare(o1.getName(), o2.getName());
            }

        });

        for (int i = 0; i < userlist.size(); i++) {
            User user_temp = (User) userlist.get(i);
            System.out.println(user_temp.getAge() + "," + user_temp.getName());
        }
    }
}

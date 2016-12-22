/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.model.student;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
abstract class Student {

    public void study() {
        System.out.println(this + ".study()");
    }

    @Override
    abstract public String toString();

    static class PrimaryStudent extends Student {

        @Override
        public String toString() {
            return "PrimaryStudent";
        }
    }

    static class HighSchoolStudent extends Student {

        @Override
        public String toString() {
            return "HighSchoolStudent";
        }
    }

    static class UniversityStudent extends Student {

        @Override
        public String toString() {
            return "UniversityStudent";
        }

    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new UniversityStudent(), new PrimaryStudent(), new HighSchoolStudent());
        for (Student s : students) {
            s.study(); //输出结果反映，子类通过覆盖toString方法，study()方法在不同的情况下会有不同的输出（多态）
        }
    }
}

package com.hhhhu;

import com.hhhhu.Student;

public class Khoitao {
    public static void main(String[] args) {
        Student hs=new Student();
        System.out.println(hs.toString());

        hs.setName("tan");
        hs.setClasses("c02");
        System.out.println(hs.show());
    }
}

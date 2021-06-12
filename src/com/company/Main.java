package com.company;

public class Main {
    public static void main(String[] args) {
        StaticMethod s1=new StaticMethod(111,"haizz");
        StaticMethod s2 =new StaticMethod(222,"hihi");
        StaticMethod.change();
        s1.display();
        s2.display();
    }

}
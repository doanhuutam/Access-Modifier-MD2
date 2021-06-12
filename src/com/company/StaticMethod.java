package com.company;

public class StaticMethod {
    private int rollo;
    private String name;
    private static String college = "BBDIT";

    public StaticMethod(int r, String n) {
        rollo = r;
        name = n;
    }
    public static void change(){
        college="codegym";
    }
    public void display(){
        System.out.println(rollo+" "+name+" "+college);
    }
}

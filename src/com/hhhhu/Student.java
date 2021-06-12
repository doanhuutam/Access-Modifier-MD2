package com.hhhhu;

public class Student {
    private String name="john";
   private String classes="c02";
    public Student(){

    }
    public  void setName(String name) {
        this.name = name;

    }
    public void setClasses(String classes) {
        this.classes = classes;
    }


    public String show() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

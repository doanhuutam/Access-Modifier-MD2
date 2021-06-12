package com.toan;

public class Car {
    private String name;
    private String pow;
    public static int number;
    public Car(String name,String pow){
        this.name=name;
        this.pow=pow;
        number++;
    }
}

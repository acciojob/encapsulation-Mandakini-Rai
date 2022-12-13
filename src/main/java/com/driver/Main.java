package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Mandy";
//        'name' has private access in 'com.driver.RWOnly'
        obj.setName("Mandy");
        System.out.println(obj.getName());
    }
}
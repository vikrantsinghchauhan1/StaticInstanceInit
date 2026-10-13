package com.vikrant.HomeWork;

public class LearnStaticInit {
    String name;
    int age;
    String phoneNumber;

    static{
        System.out.println("In static");   //only one times printed where object does not matter how many times  created
    }
    {
        System.out.println("Instance initialization block "); //number of times when the class is created
    }

    public LearnStaticInit(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }





}

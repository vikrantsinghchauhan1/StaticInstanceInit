package com.vikrant.HomeWork.project;

public class Student {
    static String collegeName;
   public  static int studentCount;

    int rallNumber;
    String name;

    //static Initialization
    static {
        collegeName = "Babu Banrasi Das Engineering college";
        System.out.println("College name is " + collegeName);
        studentCount = 0;
    }

    {
        studentCount = studentCount + 1;
    }

    public Student(String name, int rallNnumber) {
        this.rallNumber = rallNnumber;
        this.name = name;
    }

    public void display(){
        System.out.println("College name is " + collegeName);
        System.out.println("Number of student in college " + studentCount);
        System.out.println("Name of the Student " + name);

    }

}

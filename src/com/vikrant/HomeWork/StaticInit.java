package com.vikrant.HomeWork;

public class StaticInit {
    public static void main(String[] args) {

        User user1= new User("Vikrant",45,"paid","cvbn3456");
        User user2= new User("Vikrant1",45,"paid","dufyg273");
        User user3= new User("Vikrant2",45,"paid","378ddd");


    }

}

class User{
    String name;
    int age;
    String type;
    String userId;


    //Static initialization always run only one times
    static {
        System.out.println("In static ");
    }

    public User(String name, int age, String type, String userId) {
        super();
        this.name = name;
        this.age = age;
        this.type = type;
        this.userId = userId;
    }
    public User( int age, String type, String userId) {
        super();
        this.age = age;
        this.type = type;
        this.userId = userId;
    }
    //Instance initialization always execute when the object is created
    {
        System.out.println("In instance");
    }
    public User(){

    }


}
package com.vikrant.HomeWork;

public class Learn {
}
class Demo {

    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    Demo() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Demo1();
        new Demo1();
    }
}
//Output
//A
//B
//C
//B
//C

//A — Static block: The class initializes, so the static block executes once.
//
//B — Instance initialization block: The first new Demo() creates an object, so the instance block executes.
//
//C — Constructor: The constructor body executes after the instance block.
//
//B — Instance initialization block: The second new Demo() creates another object, so the instance block executes again.
//
//C — Constructor: The constructor body executes again.




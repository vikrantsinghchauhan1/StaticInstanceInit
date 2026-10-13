package com.vikrant.HomeWork;

public class Demo1 {
    static void main(String[] args) {
        //String t="blue";
        String s= new String("bl") +new String("ue"); //store in heap  s--> pointing to heap
        //String s=new String("blue");
        s.intern();
        String p="blue";  //this one in scp
        System.out.println(s==p);

    }
}

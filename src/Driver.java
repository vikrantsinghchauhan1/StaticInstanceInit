public class Driver {
    static void main(String[] args) {

        System.out.println("Driver main methos  Start.. ");

        StaticBlock user=new StaticBlock("Vikrant","sdf345","4512245121");
        StaticBlock user1=new StaticBlock("Vikrant1","sdfdds345","5623852");
        StaticBlock user2=new StaticBlock("Vikrant1","sdsdgff345","6526323");
        StaticBlock user3=new StaticBlock("Vikrant1","sdfasd345","8956854");
        System.out.println("Driver class executed completely");
    }
}


//Static initialization(init) block --> executed once's for class loading
//static {
//
//Common activity perform here
//}

//Instance init block --> execute for each block


//IIb SIB learn


//1. Static Initialization Block
//A static initialization block is written using the static keyword.
// It executes once when the class is initialized,
// before the class is used to create objects or access its static members in a way that triggers initialization.

//2. Instance Initialization Block (IIB)
//An instance initialization block is written using curly braces {} without the static keyword. It executes every time an object is created, as part of the constructor's execution process.
//Syntax:
//{
//    System.out.println("Instance block");
//}




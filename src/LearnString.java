public class LearnString {
    static void main(String[] args) {

       // String s=new String("ja") + new String("va");
        String name ="Vikrant"; //create in scp
        String name2=new String("Vikrant"); //Vikrant create in scp and heap
         name2.intern(); //Pointing to scp
        //name2.intern(); — returns the pooled reference, but does not change the reference stored in name2 because you don't assign the result.


        //name2.intern() looks for "Vikrant" in the pool. It is already there (from step 1),
        // so intern() just returns the existing pool reference. It does not change name2,
        // and it doesn’t replace anything in the pool.


        System.out.println(name2==name);
        String s6="Javascript"; //created in scp
        String s7=new String("Javascript").intern(); //created in heap than inter return the reference of pooled
        System.out.println(s6==s7);




    }
}

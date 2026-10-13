public class Driver2 {
    static void main(String[] args) {
        System.out.println("Driver main methos  Start.. ");

        Account account =new Account("45678945678");
        Account account1 =new Account("525265262");
        Account account2 =new Account("45678945542678");

        System.out.println("Driver class executed completely");

        String s2 =new String("ja") + new String("va");
        String s1= "java";
        s2.intern();
        System.out.println(s1==s2);

    }
}

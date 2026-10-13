public class Driver3 {
    static void main(String[] args) {
        User1 user1=new User1("Vikrant","xcvb345","paid");
        User1 user2=new User1("Ankit","dfghjk56","paid");
        User1 user3=new User1("Ashish","ghjkl567","paid");
        User1 user4=new User1("Vikrant","free");
        User1 user5=new User1();
        System.out.println("Total live count "+User1.LiveCount);
    }
}

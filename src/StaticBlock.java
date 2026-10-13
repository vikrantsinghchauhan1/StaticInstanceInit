public class StaticBlock {
    String userName;
    String userId;
    String phoneNumber;

    static{
        System.out.println("I am in static Block ");  //This static block executed once  does not matter how many object created
    }

    public StaticBlock(String userName, String userId, String phoneNumber) {
        super();  //either super and this
        System.out.println("StaticBlock.user string userName, String userId, String phoneNumber).. constructor ");
        this.userName = userName;
        this.userId = userId;
        this.phoneNumber = phoneNumber;
    }
}

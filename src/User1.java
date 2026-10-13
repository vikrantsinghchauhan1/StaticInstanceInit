public class User1 {
    String userName;
    String userId;
    String type;
    public static int LiveCount=0;

    public User1(String userName, String userId, String type) {
        super();
        this.userName = userName;
        this.userId = userId;
        this.type = type;
    }
    public User1( String userId, String type) {
        super();
        this.userId = userId;
        this.type = type;
    }

    public User1() {
    }
  {
   LiveCount=LiveCount+1;
  }


}

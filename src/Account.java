class AccountMgmt{
    public AccountMgmt(){
        System.out.println("AccountMgmt.Accountmgmt()...");
    }
}

public class Account extends AccountMgmt {
    String accountNumber;
    //Instance init block -->this will get executed when ever object is created.
    {
        System.out.println("Account IIB");
    }
    public Account(String accountNumber){
        super();
        System.out.println("Account(String accountNumber)");
        this.accountNumber=accountNumber;
    }



}


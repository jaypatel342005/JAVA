class Bank_Account{
    double accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;
    
    public void getAccountDetails(double accountNo,String userName,String email,String accountType,double accountBalance)
    {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    public void displayAccountDetails()
    {
        System.out.println("Account Details : \n"+"Account No. : "+ accountNo + "\nUsername : "+ userName + "\n" + "Email : ");
    }

}


public class Lab5_4 {
    
}

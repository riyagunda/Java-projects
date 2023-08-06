public class bankAccount {
    private String accNumber;
    private double balance;
    private String customerName;
    private String emailID;
    private String phoneNo;

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    //
    public String getAccNumber() {
        return accNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmailID() {
        return emailID;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    //
    public void depositFund(double depSum) {
        this.balance += depSum;
        System.out.println("Sum of " + depSum + " has been deposited to your account. Current balance: " + balance);
    }

    public void withdrawFund(double withdraw) {
        if(balance >= withdraw) {
            balance -= withdraw;
            System.out.println("Sum of " + withdraw + " has been withdrawn from your account. Remaining balance: " + balance);
        } else
            System.out.println("There is insufficient money in your account. Current balance: " + balance);
    }
}

public class VipCustomer {
    private String name;
    private double credLimit;
    private String emailID;

    public VipCustomer() {
        this("Default name", 0.00, "defaultemail@email.com");
    }

    public VipCustomer(String name, double credLimit) {
        this(name, credLimit, "unknown");
    }
    public VipCustomer(String name, double credLimit, String emailID) {
       this.name = name;
       this.credLimit = credLimit;
       this.emailID = emailID;
    }

    public String getName() {
        return name;
    }

    public double getCredLimit() {
        return credLimit;
    }

    public String getEmailID() {
        return emailID;
    }
}
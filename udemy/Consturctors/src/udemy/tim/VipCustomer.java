package udemy.tim;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer(){
        this("default name", "default dreditlimit", "default email");
    }

    public VipCustomer(String creditLimit, String email) {
        this("06516518",creditLimit, email);
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditLimit() {
        return creditLimit;
    }
}

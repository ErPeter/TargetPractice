package udemy.tim;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(321489, 23, "default name", "defaULT NAME", "def phone");
    }

    public BankAccount(int accountNumber, int balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
       this(9999, 0, name, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void deposit (int depositAmount){
        this.balance += depositAmount;
        System.out.println("You have " +  this.balance + " on your bank account");
    }
    public void withdraw(int withdrawalAmount){
        if((this.balance - withdrawalAmount) > 0){
            this.balance -= withdrawalAmount;
            return;
        }
        System.out.println("The amount in not correct"+ "only" + this.balance);
    }
}

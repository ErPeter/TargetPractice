package udemy.tim;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("otp");

        bank.addBranch("MyBranch");
        bank.addBranch("MyBranch");
        bank.addBranch("Erdos");

        bank.addCustomer("MyBranch", "Peter", 5627.25);
        bank.addCustomer("MyBranch", "Tom", 57.25);
        bank.addCustomer("MyBranch", "Peter", 5627.25);

        bank.listBranches();
        bank.listOfCustomers("MyBranch");
        bank.addCustomerTransaction("MyBranch", "Tom", 152);

        bank.listOfCustomers("MyBranch");

    }
}

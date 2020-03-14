package udemy.tim;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String nameOfBranch;

    public Branch(String nameOfBranch){
        this.customers = new ArrayList<Customer>();
        this.nameOfBranch = nameOfBranch;
    }

    public Branch(ArrayList<Customer> customers, String nameOfBranch) {
        this.customers = new ArrayList<Customer>();
        this.nameOfBranch = nameOfBranch;
    }

    public void addCustomer(String nameOfCustomer, double initialTransactionAmount) {
        if (findCustomer(nameOfCustomer) != null){
            System.out.println("This customer name is already in the " + this.nameOfBranch + " branch!");
            return;
        }else {
            this.customers.add(new Customer(nameOfCustomer, initialTransactionAmount));
            System.out.println("Customer added");
        }
    }


    public void additionalTransaction (String nameOfCustomer, double amountOfTransaction){
            if(findCustomer(nameOfCustomer).getName().equals(nameOfCustomer)){
                findCustomer(nameOfCustomer).addTransaction(amountOfTransaction);
            } else {
                System.out.println("There is no customer with" + nameOfCustomer + " name.");
            }
    }

    private Customer findCustomer (String name){
        for(int i = 0; i < this.customers.size(); i++){
            if (name.equals(this.customers.get(i).getName())){
                System.out.println("This customer name is already in the " + this.nameOfBranch + " branch!");
                return this.customers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public void setNameOfBranch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
    }


}


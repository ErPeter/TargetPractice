package udemy.tim;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String nameOfBranch) {
        if(findBranch(nameOfBranch) != null){
        if(nameOfBranch.equals(findBranch(nameOfBranch).getNameOfBranch())){
            System.out.println("This branch is already exists");
            return;
        }
        }else{
            Branch newBranch = new Branch(nameOfBranch);
            this.branches.add(newBranch);
        }
    }

    public void addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransactionAmount){
        if(findBranch(nameOfBranch).getNameOfBranch().equals(nameOfBranch)){
            findBranch(nameOfBranch).addCustomer(nameOfCustomer,initialTransactionAmount);
        }else {
            System.out.println("There is no such a branch");
            return;
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount){
        Branch theBranch = findBranch(branchName);
        if(theBranch != null){
            theBranch.additionalTransaction(customerName, amount);
        } else {
            System.out.println("No such a branch");
            return;
        }
    }

    public void listBranches(){
        System.out.println("We maintaining the following branches :");
        for(int i = 0; i < branches.size(); i++){
            System.out.println(branches.get(i).getNameOfBranch());
        }
    }

    private Branch findBranch(String nameOfBranch){
        for (int i = 0; i < branches.size(); i++){
            Branch theBranch = this.branches.get(i);
            theBranch = branches.get(i);
            if(theBranch.getNameOfBranch().equals(nameOfBranch))
                return theBranch;
        }
        return null;
    }

    public void listOfCustomers(String nameOfBranch){
        Branch theBranch = findBranch(nameOfBranch);
        if(theBranch == null) {
            System.out.println("There is no branch on this name");
        }else{
           ArrayList<Customer> customers = theBranch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(i + ". Customer's name is: " + customers.get(i).getName());
                System.out.println("His/here transactions are: ");
                ArrayList<Double> listOfTransactions = customers.get(i).getTransaction();
                for(int temp = 0; temp < listOfTransactions.size(); temp++){
                    System.out.println(temp + ". transaction is: " + listOfTransactions.get(temp));
                }
            }
        }

    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
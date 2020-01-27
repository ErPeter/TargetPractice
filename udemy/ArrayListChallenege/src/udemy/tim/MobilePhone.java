package udemy.tim;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scan = new Scanner(System.in);

    private ArrayList<Contacts> contacts;

    public MobilePhone(ArrayList<Contacts> contacts) {
        this.contacts = new ArrayList<>();
    }

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    private void printMenu(){
        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. Modify contact");
        System.out.println("4. Search contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print the menu");
        System.out.println("7. Quite");
    }
    public void startPhone(){
        System.out.println("The system is ready to use");
        menu();
    }

    private void menu(){
        boolean quite = false;
        int option = 6;
        int chosenNumber;
        String name;
        String phoneNumber;
        printMenu();

        while(!quite){
            System.out.println("Choose from the list");
            if(scan.hasNextInt()){
                chosenNumber = scan.nextInt();
                if (chosenNumber < 8 && chosenNumber > 0){
                    option = chosenNumber;
                }else{
                    System.out.println("The number is invalid, there is no such an option in the menu");
                }
            }else {
                System.out.println("It is not a number");
            }
            scan.nextLine();


            switch (option){
                case 1:
                    System.out.println("Enter the name of the contact: \n");
                    name = scan.nextLine();
                    System.out.println("Enter the number to the contact: \n");
                    phoneNumber = scan.nextLine();
                    addContact(Contacts.contactCreation(name, phoneNumber));
                    break;
                case 2:
                    System.out.println("Enter the name of the contact: \n");
                    name = scan.nextLine();
                    removeContact(contacts.get(findContact(name)));
                    break;
                case 3:
                    System.out.println("Enter the name of the contact: \n");
                    name = scan.nextLine();
                    modifyContact(contacts.get(findContact(name)));
                    break;
                case 4:
                    System.out.println("Enter the name of the contact: \n");
                    name = scan.nextLine();
                    searchContact(contacts.get(findContact(name)));
                    break;
                case 5:
                    for(int i = 0; i < contacts.size(); i++){
                        System.out.println(i+1 + "." + this.contacts.get(i).getName() + "\n" + this.contacts.get(i).getPhoneNumber());
                    }
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    quite = true;
            }
            option = 6;
        }
    }

    private void addContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already added to this phone");
            return;
        }
        this.contacts.add(contacts);
        System.out.println("Contact added");
    }

    private void removeContact(Contacts removeContact){
        if(findContact(removeContact.getName()) >= 0){
            this.contacts.remove(removeContact);
            System.out.println("The contact has been removed");
            return;
        }
        System.out.println("There is no such a contact");
    }

    private void modifyContact(Contacts modContacts){
        if(findContact(modContacts.getName()) >= 0){
            System.out.println("Enter the new name \r");
            modContacts.setName(scan.nextLine());
            System.out.println("Enter the new number \r");
            modContacts.setPhoneNumber(scan.nextLine());
            System.out.println("The contact has been modified");
            return;
        }
        System.out.println("There is no such a contact");
    }

    private void searchContact(Contacts searchContact){
        if(findContact(searchContact.getName()) >= 0){
            System.out.println("The name of your contact is: " + searchContact.getName() + "\n" + "His/her number is: " + searchContact.getPhoneNumber());
        }else{
            System.out.println("There is no such a contact");
        }
    }

    private int findContact(Contacts contacts) {
        return this.contacts.indexOf(contacts);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.contacts.size(); i++){
            Contacts contacts = this.contacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}

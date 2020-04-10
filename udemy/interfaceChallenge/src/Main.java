import org.xml.sax.helpers.AttributesImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player peter = new Player("Peter", 10, 4);
        System.out.println(peter);
        saveObject(peter);

        peter.setHitPoints(5);
        System.out.println(peter);
        peter.setWeapon("Rail gun");
        saveObject(peter);

        loadObject(peter);

        System.out.println(peter);

        Monster monster = new Monster("Dragon", 300, 20);
        System.out.println(monster);

        saveObject(monster);

        monster.setHealth(600);
        monster.setStrength(25);
        saveObject(monster);

        loadObject(monster);

        System.out.println(monster);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"
                + "1: to enter string \n"
                + "0: to quit");

        while (!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 0 || choice == 1) {
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.println("Enter a string");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }
            } else  {
                System.out.println("Please choose between 0 and 1");
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoadObject){
        ArrayList<String> values =readValues();
        objectToLoadObject.read(values);
        }
}

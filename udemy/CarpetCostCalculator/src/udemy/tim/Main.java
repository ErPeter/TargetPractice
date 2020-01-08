package udemy.tim;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(1, 2);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("The cost of the carpet is: " + calculator.getTotalCost());
    }
}

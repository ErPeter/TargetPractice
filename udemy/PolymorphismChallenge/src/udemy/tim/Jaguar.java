package udemy.tim;

public class Jaguar extends Car{
    public Jaguar() {
        super("Jaguar", 6, 380);
    }

    @Override
    public void start() {
        System.out.println("The jag is ready to go");;
    }

    @Override
    public void accelerate() {
        System.out.println("We are going faster");;
    }

    @Override
    public void breaking() {
        System.out.println("Slow down you little cat");;
    }
}

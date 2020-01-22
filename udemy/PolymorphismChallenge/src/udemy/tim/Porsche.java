package udemy.tim;

public class Porsche extends Car {
    public Porsche(){
        super("Porsche", 6, 720);
    }

    @Override
    public void start() {
        System.out.println("The fun is going to happen shortly");
    }

    @Override
    public void accelerate() {
        System.out.println("We've left the apex so you can accelerate");
    }

    @Override
    public void breaking() {
        System.out.println("You should be much slower to make this corner");
    }
}

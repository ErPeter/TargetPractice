package udemy.tim;

public class Suzuki extends Car{
    public Suzuki(){
        super("Suzuki", 4, 120);
    }

    @Override
    public void accelerate() {
        System.out.println("this going to take a while");
    }

    @Override
    public void breaking() {
        System.out.println("Not much g-forces are going on");
    }
}

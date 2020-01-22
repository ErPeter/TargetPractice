package udemy.tim;

//The commented code has not been used so its making warning

public class Car {
    private String nameOfTheCar;
    private int cylinderNumber;
    private int numberOfWheels;
    private int horsePower;
    private boolean engine;

    public Car(String nameOfTheCar, int cylinderNumber, int horsePower) {
        this.nameOfTheCar = nameOfTheCar;
        this.cylinderNumber = cylinderNumber;
        this.numberOfWheels = 4;
        this.horsePower = horsePower;
        this.engine = true;
    }

    public void start(){
        System.out.println("the engine has been started");
    }

    public void accelerate(){
        System.out.println("Our speed is increasing");
    }

    public void breaking(){
        System.out.println("Our car is going to stop");
    }

    public String getNameOfTheCar() {
        return nameOfTheCar;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

//    public int getNumberOfWheels() {
//        return numberOfWheels;
//    }
//
//    public int getHorsePower() {
//        return horsePower;
//    }
//
//    public boolean isEngine() {
//        return engine;
//    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3 + 1);
        System.out.println("Random number was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new  Jaguar();
            case 2:
                return new Porsche();
            case 3:
                return new Suzuki();
        }
        return null;
    }
}

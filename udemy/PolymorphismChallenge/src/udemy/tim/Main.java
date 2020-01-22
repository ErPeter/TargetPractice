package udemy.tim;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            Car car = Car.randomCar();
            assert car != null;
            System.out.println("This was the number " + i + " car" + "" +
                    "\n" + "The name of the car was " + car.getNameOfTheCar() + "\n" + "The car has " + car.getCylinderNumber() +" cylinders ");
            car.start();
            car.accelerate();
            car.breaking();
            System.out.println("\n");
        }
    }
}

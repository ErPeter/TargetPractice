public class Car extends Vehicle{
    private String manufacture;

    public Car(int speed, String manufacture) {
        super(speed, "car");
        this.manufacture = manufacture;
    }


    public String getManufacture() {
        return manufacture;
    }

    @Override
    public void moving() {
        super.moving();
        System.out.println("And it is a car!");
    }

    @Override
    public void steering() {
        System.out.println("The car is turning into an other direction!");
    }
}

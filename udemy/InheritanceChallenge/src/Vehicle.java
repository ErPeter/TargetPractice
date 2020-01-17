public class Vehicle {
    private int speed;
    private String type;

    public Vehicle(int speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public void moving (){
        System.out.println("The vehicle is moving with: " + this.speed);
    }

    public void steering(){
        System.out.println("The vehicle is turning into an other direction!");
    }

}

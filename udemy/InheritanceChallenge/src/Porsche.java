public class Porsche extends Car{
    public Porsche(int speed) {
        super(speed, "Porsche");
    }

    @Override
    public void moving() {
        super.moving();
        System.out.println("It's moving extremely fast!");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("This " + getManufacture() + " is an agile car!");
    }

    public void extraMethod(){
        System.out.println("Porsche makes very fast and agile cars");
    }
}

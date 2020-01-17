
public class Main {
    public static void main(String[] args) {
        Vehicle boat = new Vehicle(15 , "boat");
        Car car = new Car(50, "Volvo");
        Porsche nineEleven = new Porsche(123);

       String type = nineEleven.getType();
       String manufacture = nineEleven.getManufacture();
        System.out.println(type +" " + manufacture);
    }

}

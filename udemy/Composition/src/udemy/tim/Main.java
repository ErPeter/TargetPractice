package udemy.tim;

public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(2560, 1444);
        Dimensions dimensions = new Dimensions(80, 60, 70);
        Case theCase = new Case("255624561", "Corsair", "SeaSonic", dimensions);
        Motherboard motherboard = new Motherboard("8819834", "MSI", 4, 4, "MSI M60 BIOS");
        Monitor monitor = new Monitor("1891319", "Dell", 25 ,resolution);
        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();
    }
}

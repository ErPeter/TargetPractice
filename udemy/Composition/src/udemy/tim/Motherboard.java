package udemy.tim;

public class Motherboard {
    private String model;
    private String Manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String nameOfBIOS;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String nameOfBIOS) {
        this.model = model;
        Manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.nameOfBIOS = nameOfBIOS;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getNameOfBIOS() {
        return nameOfBIOS;
    }

    public void loadProgram(String programName){
        System.out.println("I've loaded the following program: " + programName);
    }
}

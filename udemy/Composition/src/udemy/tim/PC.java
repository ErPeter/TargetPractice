package udemy.tim;

public class PC {
     private Case thCase;
     private Monitor monitor;
     private Motherboard motherboard;

    public PC(Case thCase, Monitor monitor, Motherboard motherboard) {
        this.thCase = thCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getThCase() {
        return thCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
    public void powerUp(){
        thCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1555, 2801, "red");
    }
}

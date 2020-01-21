package udemy.tim;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(75, 0, true);

        System.out.println("Is the printer duplex? " + printer.isDuplex());
        printer.fillUpTheToner();
        printer.fillUpTheToner();
        printer.printPages(40);
        printer.fillUpTheToner();
        printer.printPages(15);
        System.out.println(printer.getNumberOfPrintedPages() + " Have been printed!");
    }
}

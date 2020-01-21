package udemy.tim;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        if(numberOfPrintedPages >= 0)
            this.numberOfPrintedPages = numberOfPrintedPages;
        this.duplex = duplex;
    }

    public void fillUpTheToner(){
        if(this.tonerLevel == 100){
            System.out.println("The toner is already full, no need to change it out.");
        }else {
            this.tonerLevel = 100;
            System.out.println("Your toner has been replaced and your new toner level is: " + getTonerLevel());
        }
    }

    public void printPages(int numberOfPages){
        for(int i = 1; i < numberOfPages; i++){
            if(this.tonerLevel > 0) {
                System.out.println(i + " number of page(s) have been printed.");
                this.numberOfPrintedPages++;
                this.tonerLevel = this.tonerLevel-5;
            }else {
                System.out.println("You have to change the toner");
                break;
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplex() {
        return this.duplex;
    }
}

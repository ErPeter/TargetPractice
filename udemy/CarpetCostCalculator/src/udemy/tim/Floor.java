package udemy.tim;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width < 0){
            this.width = 0.0;
        }else {
            this.width = width;
        }
        if(length < 0){
            this.length = 0.0;
        }else {
            this.length = length;
        }
    }
    public double getAra(){
        return this.length * this.width;
    }
}
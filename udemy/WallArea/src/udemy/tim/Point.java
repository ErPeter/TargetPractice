package udemy.tim;

public class Point {
    private int x;
    private int y;

    public  Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double x = (double) (this.x * this.x);
        double y = (double) (this.y * this.y);

        double distance = Math.sqrt((x + y));
        return distance;
    }

    public double distance(int x, int y){
        double distance;
        double aX = (double) x, aY = (double) y, bX = (double)this.x, bY = (double) this.y;
        distance = Math.sqrt((bX-aX)*(bX-aX)+(bY-aY)*(bY-aY));
        return distance;
    }

    public double distance(Point point){
        return Math.sqrt(((double)point.getX()-(double)this.x)*((double)point.getX()-(double)this.x)+((double)point.getY()-this.y)*((double)point.getY()-this.y));
    }
}

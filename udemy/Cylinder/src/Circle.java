public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > -1) {
            this.radius = radius;
        }else {
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}

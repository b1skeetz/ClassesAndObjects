package Task3;

public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(){

    }
    public Circle(double radius, double centerX, double centerY){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(double centerX, double centerY){
        this.centerX = centerX;
        this.centerY = centerY;
    }


    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
    public double squareOfCircle(){
        double result = Math.PI * Math.pow(getRadius(), 2);
        return result;
    }
    public double lengthOfCircle(){
        double result = 2 * Math.PI * getRadius();
        return result;
    }
    public void show(){
        System.out.println("Radius = " + getRadius());
        System.out.println("Center X = " + getCenterX());
        System.out.println("Center Y = " + getCenterY());
    }
}
package Task2;
import java.lang.Math;

public class Point {
    private double X;
    private double Y;

    public Point() {

    }

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public boolean belongToLine(Point p1, Point p2) {
        double resultX = ((getX()-p1.getX())/(p2.getX()-p1.getX()));
        double resultY = ((getY()-p1.getY())/(p2.getY()-p1.getY()));;
        if(resultY == resultX){
            return true;
        }
        else{
            return false;
        }
    }
    public double rangeBetweenPoints(Point p2){
        double range = (Math.sqrt(Math.pow((p2.getX() - getX()), 2) + Math.pow((p2.getY() - getY()), 2)));
        return range;
    }
}


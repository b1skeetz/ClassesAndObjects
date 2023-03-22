package Task3;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2);
        c1.setRadius(5);
        System.out.println("Square of circle = ~" + Math.round(c1.squareOfCircle()));
        System.out.println("Lenth of circle = ~" + Math.round(c1.lengthOfCircle()));
        c1.show();
    }
}
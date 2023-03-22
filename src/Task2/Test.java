package Task2;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(-1, 3);
        Point p2 = new Point(2, -2);

        Point p4 = new Point(0, 3);
        Point p5 = new Point(4, -5);
        Point pBetween = new Point(-1, 5);

        System.out.println("Range between p1 and p2 = " + p1.rangeBetweenPoints(p2));
        if(pBetween.belongToLine(p4, p5)){
            System.out.println("Point with coordinates (" + pBetween.getX() + ";" + pBetween.getY() + ") belongs to Line with coordinates (" +
                    p4.getX() + ";" + p4.getY() + ") and (" + p5.getX() + ";" + p5.getY() + ")");
        }
        else{
            System.out.println("Error");
        }
    }
}

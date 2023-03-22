package Task1;
import Task2.Point;

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car("Lamborgini", 2021, 10000);
        Car friendsCar = new Car();
        friendsCar.setModel("Bugati");
        friendsCar.setReleaseYear(2021);
        friendsCar.setDistance(15000);

        myCar.show();
        friendsCar.show();
    }
}

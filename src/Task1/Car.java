package Task1;

public class Car {
    private String model;
    private int releaseYear;
    private int distance;

    public Car(){

    }

    public Car(String model, int releaseYear, int distance){
        this.model = model;
        this.releaseYear = releaseYear;
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDistance() {
        return distance;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void show(){
        System.out.println("--------------------------------");
        System.out.println("Car's model: " + getModel());
        System.out.println("Car's release year: " + getReleaseYear());
        System.out.println("Car's passed distance: " + getDistance() + " km");
        System.out.println("--------------------------------\n");
    }
}

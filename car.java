package OOP;

public class car {

    private String model;
    private int year;

    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetail() {
        System.out.println("Car model: " + model + ", Year: " + year);
    }
}

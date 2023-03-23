package lab_1;

public class Car {
    private int horsepower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    private double fuelEfficiency;

    public Car(int horsepower, double engineVolume, String brand, String model, int year, double fuelEfficiency) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getHorsepower() {
        return horsepower;
    }

}


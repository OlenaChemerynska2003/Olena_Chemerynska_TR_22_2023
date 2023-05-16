package lab_6;

public class PostalSorting implements PostalSortingInterface {
    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;
    private int parcelCount;
    private double cost;

    public void input(String city, String street, int houseNumber, int apartmentNumber, int parcelCount, double cost) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.parcelCount = parcelCount;
        this.cost = cost;
    }

    public void display() {
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Parcel Count: " + parcelCount);
        System.out.println("Cost: " + cost);
    }

    public int calculateTotalParcelCount() {
        return parcelCount;
    }

    public double calculateTotalCost() {
        return cost;
    }
}

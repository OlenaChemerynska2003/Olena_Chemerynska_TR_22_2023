package lab_6;

public interface PostalSortingInterface {
    void input(String city, String street, int houseNumber, int apartmentNumber, int parcelCount, double cost);
    void display();
    int calculateTotalParcelCount();
    double calculateTotalCost();
}
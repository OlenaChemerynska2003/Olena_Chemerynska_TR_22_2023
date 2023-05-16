package lab_6;

import lab_6.PostalSorting;
import lab_6.PostalSortingInterface;

public class ExtendedPostalSorting extends PostalSorting implements PostalSortingInterface {
    private String additionalField1;
    private String additionalField2;

    public void input(String city, String street, int houseNumber, int apartmentNumber, int parcelCount, double cost, String additionalField1, String additionalField2) {
        super.input(city, street, houseNumber, apartmentNumber, parcelCount, cost);
        this.additionalField1 = additionalField1;
        this.additionalField2 = additionalField2;
    }

    public void display() {
        super.display();
        System.out.println("Additional Field 1: " + additionalField1);
        System.out.println("Additional Field 2: " + additionalField2);
    }

}

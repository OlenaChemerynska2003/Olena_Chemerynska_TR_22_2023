package lab_6;

public class Person implements PersonInterface {
    private String fullName ;
    private int age;

    public Person() {
        fullName = "test";
        age = 3;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {

        System.out.println(fullName + " рухається.");
    }

    public void talk() {

        System.out.println(fullName + " говорить.");
    }

}

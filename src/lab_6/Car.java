package lab_6;

abstract class Car  {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Газуємо!");
    }
}

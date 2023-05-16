package lab_6;

public class Phone implements PhoneInterface {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone() {
        this.number = "11111111111";
        this.model = "default";
        this.weight = 0.0;
    }


    public void receiveCall(String callerName) {

        System.out.println("Дзвонить " + callerName);
    }


    public String getNumber() {

        return number;
    }


    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }

    public void sendMessage(String... numbers) {
        System.out.println("Відправлено повідомлення на наступні номери:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}

package lab_6;

public interface PhoneInterface {
    public void receiveCall(String callerName);
    public String getNumber();
    public void receiveCall(String callerName, String callerNumber);
    public void sendMessage(String... numbers);
}

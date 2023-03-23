package lab_1;

public class Task5 {
    private int number1;
    public Task5 (int number1){
        this.number1 = number1;
    }
    public int reverseNumber(){
        return number1 % 10 * 100 + number1 / 10 % 10 * 10 + number1 / 100;
    }
}

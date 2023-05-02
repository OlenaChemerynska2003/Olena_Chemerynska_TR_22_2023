package lab_5;

public class Task implements Task_Interface {
    private int number1;
    private int number2;
    private int number3;
    public Task(int number1, int number2, int number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    public int task2(int number1, int number2, int number3) {
        if (number1>number2 && number3>number2) {
            return number2;
        }
        else if (number1>number3 && number2>number3) {
            return number3;
        }
        else  {
            return number1;
        }
    }
    public void task3(int number1, int number3, int number2){
        int [] arr = {number1,number2,number3};
        System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+"]");
    }
    public void task4(int number1, int number3, int number2) {
        int[] arr = new int[3];
        arr[0] = number1;
        arr[1] = number2;
        arr[2] = number3;
        int numberResult = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (numberResult<arr[i]){
                numberResult = arr[i];
            }
        }
        System.out.println(numberResult);
    }
}

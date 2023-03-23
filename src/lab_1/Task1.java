package lab_1;

public class Task1 {
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    private int number6;
    private int number7;
    private int number8;
    private int number9;
    private int number10;
    public Task1 (int number1, int number2, int number3, int number4, int number5, int number6, int number7, int number8, int number9, int number10) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
        this.number6 = number6;
        this.number7 = number7;
        this.number8 = number8;
        this.number9 = number9;
        this.number10 = number10;
    }
    public int add() {
        int result_1 = number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
        return result_1;
    }
    public int subtraction () {
        int result_2 = number1-number2-number3-number4-number5-number6-number7-number8-number9-number10;
        return result_2;
    }
    public int multiplication(){
        int result_3 = number1*number2*number3*number4*number5*number6*number7*number8*number9*number10;
        return result_3;
    }
    public double division (){
        double result_4 = number1/number2/number3/number4/number5/number6/number7/number8/number9/number10;
        return result_4;
    }
}

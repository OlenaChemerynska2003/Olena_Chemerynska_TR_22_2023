package lab_1;

public class HelpAdd {
    private double number1;
    private double number2;
    private double number3;
    private double number4;
    private double number5;
    private double number6;
    private double number7;
    private double number8;
    private double number9;
    private double number10;
    public HelpAdd (double number1, double number2, double number3, double number4, double number5, double number6, double number7, double number8, double number9, double number10) {
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
    public double add() {
        double result_1 = number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
        return result_1;
    }
}

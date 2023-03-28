package lab_2;

public class Task1 {
private int b;
private int a;
private int c;

public Task1(int a,int b , int c ){
    this.a=a;
    this.b=b;
    this.c=c;
}

public String main_task1(){

        double D = b * b - 4.0 * a * c;

        if (D > 0.0) {
            double r1 = (-b + Math.sqrt(D)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(D)) / (2.0 * a);
            return  "Розв’язки рівняння: " + r1 + " і " + r2;
        }
        else if (D == 0.0) {
            double r1 = -b / (2.0 * a);
            return  "Розв’язок рівняння: " + r1;
        }
        else {
            return "Розв’язків рівняння немає";
        }
    }
}

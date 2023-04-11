package lab_3;

public class Task5 implements Task_5_Interface{
public void task5(){
    for(double i=0; i<=2; i+=0.1){
        System.out.println("Результат"+(Math.sqrt(i))/(i+1));
    }
}
}

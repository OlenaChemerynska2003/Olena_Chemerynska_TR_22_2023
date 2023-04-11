package lab_3;

public class Task2 implements Task_2_Interface {
    public void task2(){
        for (int i=0;i<3;i++){
            for (int j=0;j<60;j++){
                System.out.println(i + "h"+" "+j+""+"min");
            }
        }
    }
}

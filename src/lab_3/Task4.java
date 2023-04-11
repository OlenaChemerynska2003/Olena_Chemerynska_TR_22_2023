package lab_3;

public class Task4 implements Task_4_Interface {
    public void task4(){
        for (int i=0;i<3;i++){
            for (int j=0;j<60;j++){
                for (int h=0; h<60; h++){
                    System.out.println(i + "h"+" "+j+""+"min"+" "+h+"sec");

                }
            }
        }
    }
}

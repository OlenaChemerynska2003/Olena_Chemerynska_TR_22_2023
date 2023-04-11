package lab_3;

public class Task3 implements Task_3_Interface {
    public void task3(){
        int i=0;
        while (i<3){
            int j=0;
            while (j<60){
                System.out.println(i + "h"+" "+j+""+"min");
                j++;
            }
            i++;
        }
    }
}

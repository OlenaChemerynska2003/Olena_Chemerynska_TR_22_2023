package lab_4;

import java.util.*;

public class Task_1 implements Task_1_Interface {
    public void task1_1() {
        ArrayList<Integer> p = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                p.add(i);
            }
        }
        System.out.println(p);
    }
    public void task1_2(){
        ArrayList<Integer> p = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (i%2!=0) {
                p.add(i);
            }
        }
        System.out.println(p);
    }
}

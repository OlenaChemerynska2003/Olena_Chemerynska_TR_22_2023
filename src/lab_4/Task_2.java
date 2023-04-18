package lab_4;

import java.util.*;
public class Task_2 implements Task_2_Interface{
    public void task2_1(int arr []) {
        int i=0;
        while (i< arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }

    public void task2_2(int arr []) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public void task2_3(int arr []) {
        int i=0;
        while (i< arr.length){
           if (i%2 != 0){
            System.out.println(arr[i]);
           }
            i++;
        }

    }
    public void task2_4(int arr []) {
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void task2_5(int arr []) {
        for(int i=arr.length-1;i>=0;i--) {
                System.out.println(arr[i]);
        }
    }


}

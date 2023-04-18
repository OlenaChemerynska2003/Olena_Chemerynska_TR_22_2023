package lab_4;

public class Task_3 implements  Task_3_Interface {
    public void task3(int arr []){
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}

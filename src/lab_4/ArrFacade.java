package lab_4;

public class ArrFacade {
    Task_1 task1 = new Task_1();
    Task_2 task2 = new Task_2();
    Task_3 task3 = new Task_3();
    Task_4 task4 = new Task_4() ;

    public void main_facade(int arr [] ){
        System.out.println("----------- 1-1 ----------- ");
        task1.task1_1();
        System.out.println("----------- 1-2 ----------- ");
        task1.task1_2();

        System.out.println("----------- 2-1 ----------- ");
        task2.task2_1(arr);
        System.out.println("----------- 2-2 ----------- ");
        task2.task2_2(arr);
        System.out.println("----------- 2-3 ----------- ");
        task2.task2_3(arr);
        System.out.println("----------- 2-4 ----------- ");
        task2.task2_4(arr);
        System.out.println("----------- 2-5 ----------- ");
        task2.task2_5(arr);
        System.out.println("----------- 3-1 ----------- ");
        task3.task3(arr);
        System.out.println("----------- 4-1 ----------- ");
        task4.task4(arr);
    }
}

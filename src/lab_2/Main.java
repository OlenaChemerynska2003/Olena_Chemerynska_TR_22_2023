package lab_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------TASK-1--------------------------------------");

        Task1 task1 = new Task1(6, 8, 2);
        System.out.println(task1.main_task1());

        System.out.println("---------------------------TASK-1--------------------------------------");

        System.out.println("---------------------------TASK-2--------------------------------------");

        Task2 task2 = new Task2(3, 4);
        System.out.println(task2.main_task2());

        System.out.println("---------------------------TASK-2--------------------------------------");

        System.out.println("---------------------------TASK-3--------------------------------------");

        Task3 task3 = new Task3(6);
        System.out.println(task3.main_task3_1());
        System.out.println(task3.main_task3_2());

        System.out.println("---------------------------TASK-3--------------------------------------");

        System.out.println("---------------------------TASK-4--------------------------------------");

        Task4 task4 = new Task4(3);
        System.out.println(task4.main_task4());

        System.out.println("---------------------------TASK-4--------------------------------------");

        System.out.println("---------------------------TASK-5--------------------------------------");

        Task5 task5 = new Task5(3,12,3);
        System.out.println(task5.main_task5_1());
        System.out.println(task5.main_task5_2());
        System.out.println(task5.main_task5_3());
        System.out.println(task5.main_task5_4());
        System.out.println(task5.main_task5_5());
        System.out.println(task5.main_task5_6());

        System.out.println("---------------------------TASK-5--------------------------------------");
    }

}

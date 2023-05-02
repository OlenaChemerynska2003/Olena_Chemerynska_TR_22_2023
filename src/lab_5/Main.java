package lab_5;

public class Main {
    public static void main(String[] args) {
        Facade_Task facade_task = new Facade_Task();
        Decorator_Task decoratorTask = new Decorator_Task(facade_task);
        decoratorTask.main_task();
    }
}
package lab_5;

public class Decorator_Task implements Facade_Interface  {
private Facade_Interface facade;
    protected Decorator_Task(Facade_Interface facade){
        this.facade=facade;
    }

    @Override
    public void main_task() {
        facade.main_task();
        double d1=3;
        double d2=1.3;

        System.out.println("Площа ромба=" + d1*d2/2);
    }
}

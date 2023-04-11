package lab_3;


public class Task1 implements Task_Interface {
  public void task1(String text, int count){
      for (int i = 0; i < count; i++) {
          System.out.println(text);
      }
  }
    public void task1_1(String text, int count){
        int i =0 ;
        while(i<count){
            System.out.println(text);
            i++;
        }
    }


}

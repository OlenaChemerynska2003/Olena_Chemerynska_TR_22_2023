import java.util.*;
public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> p = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (i%2!=0) {
                p.add(i);
            }
        }
        System.out.println(p);
    }
}
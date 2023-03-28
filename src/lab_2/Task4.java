package lab_2;

public class Task4 {
    private int x;

    public Task4(int x){
        this.x=x;
    }


    public double main_task4( ) {
        if (x<0) {
            return  Math.pow(x,2)+3;
        } else if (0<=x&x<=5) {
            return 6* Math.sqrt(x);
        } else if (x>5) {
            return -x+9;
        }else
        {
            return  0;
        }
    }
}

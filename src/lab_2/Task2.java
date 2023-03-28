package lab_2;

public class Task2 {
    private int x;
    private int y;

    public Task2(int x , int y ){
        this.x=x;
        this.y=y;
    }

    public String main_task2() {
        if (x > 0 && y > 0) {
            return "Point is located in the 1st quadrant";
        } else if (x < 0 && y > 0) {
            return "Point is located in the 2nd quadrant";
        } else if (x < 0 && y < 0) {
            return "Point is located in the 3rd quadrant";
        } else if (x > 0 && y < 0) {
            return "Point is located in the 4th quadrant";
        }
        else {
            return "Point not";
        }
    }
}

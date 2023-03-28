package lab_2;

public class Task3 {
    private int number;

    public Task3(int number){
        this.number=number;
    }
    //Task3
    public String main_task3_1( ) {

        if (number > 9 & number < 100 ) {
            return  "Число двозначне";
        } else {
            return  "Число не двозначне";
        }
    }
    public String main_task3_2( ) {

        if (number % 2 ==0 ) {
            return  "Число парне";
        } else {
            return  "Число не парне";
        }
    }
}

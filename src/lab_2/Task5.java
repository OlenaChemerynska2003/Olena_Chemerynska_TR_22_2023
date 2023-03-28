package lab_2;

public class Task5 {
    private int x;
    private int number_1;
    private int number_2;

    public Task5(int x , int number_1 , int number_2){
        this.x =x;
        this.number_1=number_1;
        this.number_2=number_2;
    }

    //Task 5
    public  String main_task5_1() {
        switch (x) {
            case 6: case 7:
                return "Вихідний";
            default:
                return "Робочий";
        }
    }
    public  String main_task5_2() {

        switch (x) {
            case 1 : case 2: case 12:
                return "Зима";
            case 3: case 4: case 5:
                return "Весна";
            case 6: case 7:case 8:
                return "Літо";
            case 9:case 10:case 11:
                return "Осінь";
            default:
                return "Помилка";
        }
    }
    public  String main_task5_3() {
        String days = "";

        switch (x) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                days = "31";
                break;
            case 4: case 6:
            case 9: case 11:
                days = "30";
                break;
            case 2:
                days = "29 або 28";
                break;
            default:
                days="Помилка";
        }
        return "В" + x + "місяці " + days + "днів";
    }
    public  String main_task5_4( ) {
        String text = "";

        switch (x) {
            case 1:
                text = "Доброго дня";
                break;
            case 2:
                text = "Запрошую вас до роботи";
                break;
            case 3:
                text = "завершення роботи ";
                break;
            default:
                text="Invalid ";
        }
        return  text;
    }
    public  String main_task5_5( ) {
        int number;

        if (x >= 0 && x < 15) {
            number=1;
        } else if (x >= 15 && x < 30) {
            number=2;
        } else if (x >= 30 && x < 45) {
            number=3;
        } else number=4;

        switch (number) {
            case 1:
                return  "перша чверть години";
            case 2:
                return  "друга чверть години";
            case 3:
                return "третя чверть години";
            case 4:
                return  "четверта чверть години ";
            default:
                return "Помилка";
        }
    }
    public  String main_task5_6() {

        switch (x) {
            case 1:
                return ("добутку " + (number_1 * number_1));
            case 2:
                return ("сума " + (number_1 + number_2));
            case 3:
                return ("різниця " + (number_1 - number_2));
            default:
                return "Помилка";
        }
    }

    }

package lab_1;


public class Main {


    public static void main(String[] args)
    {

        // ЗАВДАННЯ 1
        System.out.println("----------- ЗАВДАННЯ 1 ----------- ");

        Task1 task1 = new Task1 (3,6,8,1,9,2,4,8,9,2);


        System.out.println(task1.add());
        System.out.println(task1.subtraction());
        System.out.println(task1.multiplication());
        System.out.println(task1.division());

        // ЗАВДАННЯ 2
        System.out.println("----------- ЗАВДАННЯ 2 ----------- ");

        Task2 task2 = new Task2 ("Завдяки", "своїй", "працелюбності", "та", "наполегливості", ",", "вона", "досягла", "своєї", "мети", "!", "!");
        System.out.println(task2.concatWord());

        // ЗАВДАННЯ 3

        System.out.println("----------- ЗАВДАННЯ 3 ----------- ");

        User user1 = new User(1, 23, "John", "Doe", 75.2, 180.3);
        User user2 = new User(2, 31, "Jane", "Smith", 61.5, 165.2);
        User user3 = new User(3, 42, "Peter", "Lee", 88.9, 190.5);
        User user4 = new User(4, 19, "Mary", "Wilson", 52.1, 155.0);
        User user5 = new User(5, 28, "Tom", "Taylor", 70.3, 175.8);
        User user6 = new User(6, 35, "Sarah", "Johnson", 63.7, 170.1);
        User user7 = new User(7, 27, "David", "Brown", 78.0, 183.6);
        User user8 = new User(8, 39, "Emily", "Miller", 59.6, 160.9);
        User user9 = new User(9, 22, "Michael", "Davis", 81.4, 187.4);
        User user10 = new User(10, 25, "Lisa", "Anderson", 67.8, 173.2);

        HelpAdd helpAdd1 = new HelpAdd(user1.getAge(), user2.getAge(), user3.getAge(), user4.getAge(), user5.getAge(), user6.getAge(), user7.getAge(), user8.getAge(), user9.getAge(), user10.getAge());
        HelpAdd helpAdd2 = new HelpAdd(user1.getWeight(), user2.getWeight(), user3.getWeight(), user4.getWeight(), user5.getWeight(), user6.getWeight(), user7.getWeight(), user8.getWeight(), user9.getWeight(), user10.getWeight());
        HelpAdd helpAdd3 = new HelpAdd(user1.getHeight(), user2.getHeight(), user3.getHeight(), user4.getHeight(), user5.getHeight(), user6.getHeight(), user7.getHeight(), user8.getHeight(), user9.getHeight(), user10.getHeight());

        System.out.println("Total age: " + helpAdd1.add());
        System.out.println("Total weight: " + helpAdd2.add());
        System.out.println("Total height: " + helpAdd3.add());

        // ЗАВДАННЯ 4

        System.out.println("----------- ЗАВДАННЯ 4 ----------- ");

        Car car1 = new Car(150, 2.0, "Toyota", "Corolla", 2020, 6.5);
        Car car2 = new Car(180, 2.5, "Honda", "Civic", 2019, 7.0);
        Car car3 = new Car(220, 3.0, "BMW", "M5", 2021, 9.5);
        Car car4 = new Car(90, 1.5, "Ford", "Fiesta", 2018, 5.5);
        Car car5 = new Car(120, 1.6, "Volkswagen", "Golf", 2022, 6.0);
        Car car6 = new Car(200, 2.0, "Mercedes-Benz", "C-Class", 2021, 8.0);
        Car car7 = new Car(250, 3.5, "Audi", "S6", 2022, 10.0);
        Car car8 = new Car(160, 1.8, "Nissan", "Sentra", 2019, 7.5);
        Car car9 = new Car(100, 1.4, "Peugeot", "208", 2020, 5.0);
        Car car10 = new Car(190, 2.0, "Subaru", "WRX", 2018, 8.5);

        HelpAdd helpAdd4 = new HelpAdd(car1.getEngineVolume() , car2.getEngineVolume() , car3.getEngineVolume() , car4.getEngineVolume() , car5.getEngineVolume() , car6.getEngineVolume() , car7.getEngineVolume() , car8.getEngineVolume(), car9.getEngineVolume() , car10.getEngineVolume());
        HelpAdd helpAdd5 = new HelpAdd(car1.getHorsepower() , car2.getHorsepower() , car3.getHorsepower() , car4.getHorsepower() , car5.getHorsepower() , car6.getHorsepower() , car7.getHorsepower() , car8.getHorsepower() , car9.getHorsepower() , car10.getHorsepower());


        System.out.println("Total engine volume: " + helpAdd4.add());
        System.out.println("Total horsepower: " + helpAdd5.add());

        // ЗАВДАННЯ 5

        System.out.println("----------- ЗАВДАННЯ 5 ----------- ");

        Task5 task5 = new Task5(412);

        System.out.println(task5.reverseNumber());
    }
}

package lab_7;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<>();

        // Створення об'єктів автомобілів
        cars.add(new Car("Toyota", 150, new Driver("John", 30, 5), 10000, 2015));
        cars.add(new Car("Honda", 120, new Driver("Emily", 25, 2), 8000, 2012));

        cars.add(new Car("BMW", 150, new Driver("Ivan", 30, 5), 10000, 2015));
        cars.add(new Car("Audi", 120, new Driver("Olena", 25, 2), 8000, 2012));

        Car a = cars.get(1);
        System.out.println(a);
        System.out.println(a.getBrand());
        // Ремонт автомобілів

        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.repairEngine();
            Driver newDriver = new Driver("New Driver", 28, 3); // Новий водій
            car.hireDriver(newDriver);
        }

        // Зміна потужності та ціни кожної другої машини
        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.increasePowerAndPrice();
        }

        // Перевірка досвіду водіїв та відправлення на курси підвищення кваліфікації
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseExperience();
            }
        }

    }
}

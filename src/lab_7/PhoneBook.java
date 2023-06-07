package lab_7;
import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    public static void main(String[] args)
    {
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання записів у книгу
        phoneBook.put("Smith", "123456789");
        phoneBook.put("Johnson", "987654321");
        phoneBook.put("Williams", "456789123");
        phoneBook.put("Jones", "321654987");
        phoneBook.put("Brown", "789123456");
        phoneBook.put("Davis", "654987321");
        phoneBook.put("Miller", "147258369");
        phoneBook.put("Wilson", "369852147");
        phoneBook.put("Taylor", "852369147");
        phoneBook.put("Clark", "258369147");

        // Виведення інформації з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }

        // Пошук номеру за прізвищем
        String lastName = "Taylo";
        if (phoneBook.containsKey(lastName)) {
            String phoneNumber = phoneBook.get(lastName);
            System.out.println("Номер телефону для прізвища " + lastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення запису з книги
        phoneBook.remove("Brown");

        // Виведення кількості записів у книзі
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);

    }
}

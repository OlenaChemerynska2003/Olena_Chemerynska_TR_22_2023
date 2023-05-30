package lab_8;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String fileName = "src/lab_8/best.txt";
        int start = 1;
        int end = 10;
        int count = 2;

        // Перевірка існування файлу
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Помилка створення файлу: " + e.getMessage());
                return;
            }
        }

        // Запис послідовності випадкових чисел у файл
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(end - start + 1) + start;
                writer.write(String.valueOf(randomNumber));
                writer.write(System.lineSeparator());
            }
            System.out.println("Послідовність випадкових чисел записана у файл " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка запису в файл: " + e.getMessage());
        }

        // Читання інформації з файлу і виведення на консоль
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println("Зміст файлу " + fileName + ":");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}
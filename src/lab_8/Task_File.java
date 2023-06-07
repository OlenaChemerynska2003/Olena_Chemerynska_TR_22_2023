package lab_8;

import java.io.*;
import java.util.Random;

public class Task_File {
   private String fileName ;
    private int start;
   private int end ;
    private  int count ;

    public Task_File(String fileName ,int start, int end,int count){
        this.fileName=fileName;
        this.start=start;
        this.end=end;
        this.count=count;
    }

    public void main(){
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Помилка створення файлу: " + e.getMessage());
                return;
            }
        }

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

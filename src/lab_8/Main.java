package lab_8;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String fileName = "src/lab_8/best.txt";
        int start = 1;
        int end = 10;
        int count = 5;

       Task_File taskFile = new Task_File(fileName,start,end,count);
       taskFile.main();
    }
}
package SandBox;


import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class sandboxTest {

    public static void main(String[] args) throws IOException {
        //Count number of lines in a file, create an array with that size and print it


        int lines = 0;

        File file = new File("C:/Users/me/IdeaProjects/Sandbox/Values.txt");

        if (file.exists()) {
            System.out.println("Found!");
            Scanner numberOfLines = new Scanner(file);
            while (numberOfLines.hasNextLine()) {
                numberOfLines.nextLine();
                lines++;
            }
            numberOfLines.close();
            int[] numbers = new int[lines];
            Scanner numbersInFile = new Scanner(file);

            for (int i = 0; i < lines; i++) {
                numbers[i] = Integer.parseInt(numbersInFile.nextLine());
            }
            numbersInFile.close();
            printArray(numbers);
        }
        System.out.println("Success!");
    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.println(val);
        }
    }
}

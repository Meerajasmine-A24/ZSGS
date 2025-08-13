//  Write a Java program that reads a file and prints the number of lines, words, and characters.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = s.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            File file = new File(fileName);
            Scanner fs = new Scanner(file);

            while (fs.hasNextLine()) {
                String line = fs.nextLine();
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            fs.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}

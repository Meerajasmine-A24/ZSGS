/*
. Write a Menu driven Java program 
a) to read content from the user and write it into another file 
b) copy content from one file to another 
c) modify the content of a file 
d) search for a particular word in a file and display how many times it appears 
e) read the content (List of Electronic Products) of a .txt file and copy them to a .csv file
*/

import java.util.*;
import java.io.*;

public class Problem2 {

    // a) Write user input to a file
    public static void writeToFile(Scanner s) {
        System.out.println("Enter the file name to store the content: ");
        String fileName = s.nextLine();

        System.out.println("Enter content (type 'END' to stop):");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = s.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            content.append(line).append("\n");
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content.toString());
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // b) Copy content from one file to another
    public static void copyToFile(Scanner s) {
        System.out.print("Enter source filename: ");
        String source = s.nextLine();
        System.out.print("Enter destination filename: ");
        String destination = s.nextLine();

        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            System.out.println("Copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // c) Modify file
    public static void modifyFile(Scanner s) {
        System.out.print("Enter filename to modify: ");
        String fileName = s.nextLine();
        System.out.println("Enter new content (type 'END' to finish):");

        try (FileWriter writer = new FileWriter(fileName)) {
            while (true) {
                String line = s.nextLine();
                if (line.equalsIgnoreCase("END")) break;
                writer.write(line + "\n");
            }
            System.out.println("File modified.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // d) Search word in file
    public static void searchWord(Scanner scanner) {
        System.out.print("Enter filename: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter word to search: ");
        String word = scanner.nextLine();

        int count = 0;

        try (FileReader fr = new FileReader(fileName)) {
            Scanner fileScanner = new Scanner(fr);
            while (fileScanner.hasNext()) {
                String token = fileScanner.next();
                if (token.equalsIgnoreCase(word)) {
                    count++;
                }
            }
            fileScanner.close();
            System.out.println("The word '" + word + "' appears " + count + " time(s).");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // e) Read product list from .txt and write to .csv
    public static void txtToCsv(Scanner scanner) {
        System.out.print("Enter source .txt file: ");
        String txtFile = scanner.nextLine();
        System.out.print("Enter destination .csv file: ");
        String csvFile = scanner.nextLine();

        try (FileReader fr = new FileReader(txtFile);
             Scanner fileScanner = new Scanner(fr);
             FileWriter writer = new FileWriter(csvFile)) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                writer.write("\"" + line + "\"\n");
            }

            System.out.println("Products copied to " + csvFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Write content to a file");
            System.out.println("2. Copy content from one file to another");
            System.out.println("3. Modify content of a file");
            System.out.println("4. Search for a word in a file");
            System.out.println("5. Copy product list from .txt to .csv");
            System.out.println("6. Exit");
            System.out.print("Enter your choice from 1 to 6: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1:
                    writeToFile(scanner);
                    break;
                case 2:
                    copyToFile(scanner);
                    break;
                case 3:
                    modifyFile(scanner);
                    break;
                case 4:
                    searchWord(scanner);
                    break;
                case 5:
                    txtToCsv(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

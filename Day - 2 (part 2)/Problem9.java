// Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[10][3];
        int[] rollNos = new int[10];
        int[] total = new int[10];
        double[] average = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Roll No for Student " + (i + 1) + ": ");
            rollNos[i] = sc.nextInt();
            System.out.println("Enter marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            average[i] = total[i] / 3.0;
        }

        System.out.println("\nRoll No\tTotal Marks\tAverage");
        for (int i = 0; i < 10; i++) {
            System.out.println(rollNos[i] + "\t" + total[i] + "\t\t" + String.format("%.2f", average[i]));
        }

        sc.close();
    }
}

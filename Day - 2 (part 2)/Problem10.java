

import java.util.Scanner;

class Matrix {
    int[][] matrix;
    int m, n;

    Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new int[m][n];
    }

    void input(Scanner s) {
        System.out.println("Enter elements row wise:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
    }

    void display() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    int sums() {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    void rowSum() {
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < m; i++) {
            int rowTotal = 0;
            for (int j = 0; j < n; j++) {
                rowTotal += matrix[i][j];
            }
            System.out.println("The sum of the row " + i + ": " + rowTotal);
        }
    }

    void colSum() {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
            int colTotal = 0;
            for (int i = 0; i < m; i++) {
                colTotal += matrix[i][j];
            }
            System.out.println("Sum of the column " + j + ": " + colTotal);
        }
    }

    void transpose() {
        System.out.println("Transpose of matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Row size : ");
        int m = s.nextInt();
        System.out.println("Enter Col Size :");
        int n = s.nextInt();

        Matrix mat = new Matrix(m, n);
        mat.input(s);
        mat.display();
        System.out.println("Sum = " + mat.sums());
        mat.rowSum();
        mat.colSum();
        mat.transpose();
    }
}

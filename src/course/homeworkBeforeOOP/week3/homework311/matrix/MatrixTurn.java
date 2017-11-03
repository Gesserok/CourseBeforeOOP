package course.homeworkBeforeOOP.week3.homework311.matrix;

import java.util.Scanner;

public class MatrixTurn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '\"R'\" a size of matrix RxR:");
        int r = scanner.nextInt();
        int[][] matrix = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                matrix[i][j] = (int)(Math.random()*100);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("angle of rotation multiple of 90: ");
        int angle = scanner.nextInt();
        int kol = angle / 90;

        if (kol % 4 == 0) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (kol % 4 == 1) {
        //поворот на 90 грндусов по часовой стрелке
            matrix = matrixTurn(matrix);
        }
        if (kol % 4 == 2) {
            for (int i = 0; i < 2; i++) {
                matrix = matrixTurn(matrix);
            }
        }
        if (kol % 4 == 3) {
            for (int i = 0; i < 3; i++) {
                matrix = matrixTurn(matrix);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixTurn(int[][] matrix) {
        int r = matrix.length;
        for (int i = 0; i < r / 2; i++) {
            for (int j = 0; j < r - i - 1; j++) {
                int temp = matrix[i][j];
                temp = matrix[i][j];
                matrix[i][j] = matrix[r - j - 1][i];
                matrix[r - j - 1][i] = matrix[r - i - 1][r - j - 1];
                matrix[r - i - 1][r - j - 1] = matrix[j][r - i - 1];
                matrix[j][r - i - 1] = temp;
            }
        }
        return matrix;
    }

}

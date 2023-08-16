package Bai_tap;

import java.util.Scanner;

public class BT_MainDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so hang va cot cua ma tran vuong: ");
        int row = scanner.nextInt();
        float[][] arr = new float[row][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("phan tu hang " + (i + 1) + " thu " + (j + 1) + " la: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("tổng các số ở đường chéo chính của ma trận vuông la: " + sum);
    }
}

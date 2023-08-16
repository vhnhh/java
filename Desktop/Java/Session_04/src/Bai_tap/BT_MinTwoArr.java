package Bai_tap;

import java.util.Scanner;

public class BT_MinTwoArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so hang: ");
        int row = scanner.nextInt();
        System.out.print("so cot: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("phan tu hang " + (i + 1) + " thu " + (j + 1) + " la: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sumIndex0 = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumIndex0 += arr[i][j];
            }
        }
        int min = sumIndex0;
        for (int i = 1; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
            if (min > sum) {
                min = sum;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            if (sum==min) {
                System.out.println("tong lon nhat la " + min + " index la " + i);
            }
        }
    }
}

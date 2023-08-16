package Bai_tap;

import java.util.Scanner;

public class BT_SumColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so hang: ");
        int row = scanner.nextInt();
        System.out.print("so cot: ");
        int col = scanner.nextInt();
        float[][] arr = new float[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("phan tu hang " + (i + 1) + " thu " + (j + 1) + " la: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.print("tinh tong cua cot so: ");
        int colToSum = scanner.nextInt();
        if (colToSum<0||colToSum>= arr.length){
            System.err.println("khon ton tai vi tri cot nay");
            System.exit(0);
        }

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][colToSum];
        }
        System.out.println("cot " + colToSum + " co tong la " + sum);
    }
}

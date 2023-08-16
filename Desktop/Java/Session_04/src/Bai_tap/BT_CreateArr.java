package Bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BT_CreateArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 4, 6, 7, 0, 0, 0};
//        System.out.println(arr.length);
        System.out.print("ban muon chen vao mang phan tu co gia tri la: ");
        int x = scanner.nextInt();
        System.out.print("va co index la: ");
        int index = scanner.nextInt();
        if (index<=-1||index>=arr.length) {
            System.err.println("khong chen duoc phan tu vao mang");
            System.exit(0);
        }

        for (int i = arr.length-1; i >= index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}

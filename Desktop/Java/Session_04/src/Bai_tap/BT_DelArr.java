package Bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BT_DelArr {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0};
//        int[] newArr = new int[arr.length - 1];
//        System.out.print("Co mang co cac phan tu nhu sau: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println();
//        System.out.println(arr.length);
//        System.out.print("Phan tu ban muon xoa la: ");
//        int numDel = scanner.nextInt();
//        int index_del = -1;
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (numDel != arr[i]) {
//                index_del = i;
//                newArr[j] = arr[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));


        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 0, 0, 5, 0};
        System.out.print("Co mang co cac phan tu nhu sau: ");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.print("Phan tu ban muon xoa la: ");
        int numDel = Integer.parseInt(scanner.nextLine());
        int indexDel;
        indexDel = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numDel == arr[i]) {
                indexDel = i;
            }
//            else {
//                System.err.println("khong ton tai phan tu mang gia tri " + numDel);
//                break;
//            }

        }

        for (int i = indexDel; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
    }

}


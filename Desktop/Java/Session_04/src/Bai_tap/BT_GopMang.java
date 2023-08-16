package Bai_tap;

import java.util.Arrays;

public class BT_GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0, j=0; i < arr1.length; i++) {
            arr3[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+3] =arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}

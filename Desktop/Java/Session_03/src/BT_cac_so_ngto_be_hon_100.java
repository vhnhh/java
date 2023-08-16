import java.util.Scanner;

public class BT_cac_so_ngto_be_hon_100 {
    public static void main(String[] args) {
        System.out.println("cac so nguyen tu 1 - 100 la: ");
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            if (count==5) {
                System.out.println();
                count=0;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i+"\t\t\t");
                count++;
            }
        }


    }
}

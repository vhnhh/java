import java.util.Scanner;

public class Bai_tap_in_ra_20_so_NT_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in: ");
        int qty = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        System.out.println(qty + " số nguyên tố đầu tiên là: ");
        while (count!=qty) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n+"\t");
                count++;
            }
            n++;
        }
    }
}

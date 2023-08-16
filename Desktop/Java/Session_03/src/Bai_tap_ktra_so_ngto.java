import java.util.Scanner;

public class Bai_tap_ktra_so_ngto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kiểm tra số nguyên tố cho số: ");
        int num = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num%i==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " khong là số nguyên tố");
            }
    }
}

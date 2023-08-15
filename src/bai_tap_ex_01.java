import java.util.Scanner;

public class bai_tap_ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào số tuổi của bạn:");
        short age = scanner.nextShort();
        if (age < 6 || age >= 60) {
            System.out.println("Giá vé xe bus của bạn là 0 đồng");
        } else if (age >= 6 && age < 18) {
            System.out.println("Giá vé xe bus của bạn là 3500 đồng");
        } else {
            System.out.println("Giá vé xe bus của bạn là 7000 đồng");
        }
    }
}

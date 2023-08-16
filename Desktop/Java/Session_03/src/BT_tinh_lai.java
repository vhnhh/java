import java.util.Scanner;

public class BT_tinh_lai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tien gui: ");
        money = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao so thang gui: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao ty le lai suat gui: ");
        interestRate = Integer.parseInt(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest+=money*(interestRate/100)/12*month;
        }
        System.out.print("Tong tien lai la: " + totalInterest);

    }
}

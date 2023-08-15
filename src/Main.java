import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số nguyên để kiếm tra số dư chia cho 5:");

        int num = scanner.nextInt();
        int remainder = num % 5 ;
        switch (remainder) {
            case 1:
                System.out.println(num + " % 5 = " + 1);
                break;
            case 2:
                System.out.println(num + " % 5 = " + 2);
                break;
            case 3:
                System.out.println(num + " % 5 = " + 3);
                break;
            case 4:
                System.out.println(num + " % 5 = " + 4);
                break;
            default:
                System.out.println(num + " % 5 = " + 0);
        }
    }
}
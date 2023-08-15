import java.util.Scanner;

public class Bai_tap_vong_lap_menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 số nguyên và order menu: ");
        int num = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Kiểm tra chẵn lẻ");
            System.out.println("2. Kiểm tra chia hết cho 3 và 5");
            System.out.println("3. Kiểm tra số nguyên tố");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("5. Thoát");
            System.out.print("bạn oder số: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (num % 2 == 0) {
                        System.out.println(num + " là một số chẵn");
                    }
                    if (num % 2 != 0) {
                        System.out.println(num + " là một số lẻ");
                    }
                    break;
                case 2:
                    if (num % 3 == 0 && num % 5 == 0) {
                        System.out.println(num + " chia hết cho 3 và 5");
                    }
                    if (num % 3 != 0 || num % 5 != 0) {
                        System.out.println(num + " không chia hết cho 3 và 5");
                    }
                    break;
                case 3:
                    boolean flag = true;
                    if (num >= 2) {
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            if (num % i == 0) {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println(num + " là một số nguyên tố");
                    } else {
                        System.out.println(num + " không phải là một số nguyên tố");
                    }
                    break;
                case 4:


                    int sum = 0;
                    for (int i = 1; i < num/2; i++) {
                        if (num % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == num) {
                        System.out.println(num + " là một số hoàn hảo");
                    } else {
                        System.out.println(num + " không phải là một số hoàn hảo");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Hãy order MENU từ 1 ~ 4. Vui lòng nhâp lại.");
                    break;
            }
        } while (true);
    }
}

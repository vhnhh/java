package Decision_making;

import java.util.Scanner;

public class Thuc_hanh_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình kiểm tra số ngày trong 1 tháng");
        System.out.print("Hãy nhập vào tháng mà bạn muốn kiểm tra: ");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + month + "có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + month + "có 30 ngày");
                break;
            case 2:
                System.out.println("tháng " + month + "có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("chỉ có con giáp thứ 13 chứ không có tháng thứ " + month + " bạn nhé.");
                break;
        }
    }
}

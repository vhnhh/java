import java.util.Scanner;

public class BT_thiet_ke_menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh tam giac ");
            System.out.println("2. Ve hinh vuong");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("0. Thoat");
            System.out.println("Nhap vao lua chon cua ban: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Ve hinh tam giac");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Ve hinh vuong");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Hay chon 1~4");
                    break;
            }
        }
    }
}

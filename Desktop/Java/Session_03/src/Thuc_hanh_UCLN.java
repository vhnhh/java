import java.util.Scanner;

public class Thuc_hanh_UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số thứ nhất (a): ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Số thứ nhất (b): ");
        int b = Integer.parseInt(scanner.nextLine());
        if (a==0&&b==0) {
            System.out.println("Hai số không có UCLN");
        } else if (a==0) {
            System.out.println("ƯCLN của hai số là: " + Math.abs(b));
        } else if (b==0) {
            System.out.println("ƯCLN của hai số là: " + Math.abs(a));
        } else {
            while (a!=b) {
                if (a>b) {
                    a-=b;    /*a = a -b*/
                } else {
                    b-=a;    /*b = b - a*/
                }
            }
            System.out.println("ƯCLN của hai số là: " + a);
        }
    }
}

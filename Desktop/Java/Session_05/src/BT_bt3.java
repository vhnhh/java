import java.nio.Buffer;
import java.util.Scanner;

public class BT_bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
        StringBuffer strReverse = new StringBuffer(str);
        strReverse.reverse();
        System.out.print("chuoi duoc dao nguoc la: " + strReverse);
    }
}


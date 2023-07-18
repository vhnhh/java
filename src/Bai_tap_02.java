import java.util.Scanner;

public class Bai_tap_02 {
    public static void main(String[] args) {
        float rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD:");
        float USD = scanner.nextFloat();
        System.out.println("VND is " + rate * USD);

    }
}

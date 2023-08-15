package Decision_making;

import java.util.Scanner;

public class Thuc_hanh_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cân nặng (cm) của bạn là: ");
        double weight = Integer.parseInt(scanner.nextLine());
        System.out.print("Số đo chiều cao (cm) của bạn là: ");
        double height = Integer.parseInt(scanner.nextLine());
        double BMI = weight / (height*2);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 25.0 && BMI < 30) {
            System.out.println("Normal");
        } else if (BMI <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

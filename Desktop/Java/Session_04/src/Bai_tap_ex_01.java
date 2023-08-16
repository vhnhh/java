import java.util.Scanner;

public class Bai_tap_ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập vào số lượng phần tử bạn muốn chúng tôi xử lý: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrayInt = new int[n];
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Nhập giá trị cho các phần tử của mảng");
            System.out.println("2. In ra các giá trị của mảng");
            System.out.println("3. In ra giá trị các phần tử là mảng");
            System.out.println("4. In ra các chỉ số của csc phần tử có giá trị là lẻ");
            System.out.println("5. Tính tổng các phần tử của mảng");
            System.out.println("6. Thoát");
            System.out.print("Hãy thực hiện chương trình số: ");
            int i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
//                    String arrString = "";
                    for (int index = 0; index < arrayInt.length; index++) {
                        System.out.print("Phần tử thứ " + (index + 1) + " là: ");
                        int input = Integer.parseInt(scanner.nextLine());
                        arrayInt[index] = input;
//                        arrString += (input + " ") ;
                    }
//                    System.out.println("Mảng có các phần tử là: " + arrString);
                    break;
                case 2:
                    System.out.print("Các phần tử của mảng là: ");
                    for (int index = 0; index < arrayInt.length; index++) {
                        System.out.print(arrayInt[index] + "\t");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Các phần tử chẵn của mảng là: ");
                    for (int index = 0; index < arrayInt.length; index++) {
                        if (arrayInt[index] % 2 == 0) {
                            System.out.print(arrayInt[index] + "\t");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Chỉ số các phần tử lẻ của mảng là: ");
                    for (int index = 0; index < arrayInt.length; index++) {
                        if (arrayInt[index] % 2 != 0) {
                            System.out.print(index + "\t");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    int sum = 0;
                    for (int index = 0; index < arrayInt.length; index++) {
                        sum += arrayInt[index];
                    }
                    System.out.println("Tổng của mảng là: " + sum);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Hãy chọn giá trị 1 ~ 6 trong MENU");
                    break;
            }
        } while (true);


    }
}

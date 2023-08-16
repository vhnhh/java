import java.util.Scanner;

public class Bai_tap_mang_2_chieu_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mảng 2 chiều có số dòng là: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Mảng 2 chiều có số cột là: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Nhập giá trị các phần tử trong mảng");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử mảng chia hết cho 3");
            System.out.println("4. Tính tổng các phần tử");
            System.out.println("5. In ra chỉ số dòng có tổng lớn nhất");
            System.out.print("Bạn chọn trương trình số: ");
            int ordNum = Integer.parseInt(scanner.nextLine());
            switch (ordNum) {
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            System.out.print("Phần tử thứ " + (i + 1) + " có giá trị là: ");
                            int input = Integer.parseInt(scanner.nextLine());
                            arrInt[i][j] = input;
                        }
                    }
//                    System.out.println();
                    break;
                case 2:
                    System.out.println("Mảng 2 chiều arrInt có các phần tử là: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            System.out.print(arrInt[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Mảng 2 chiều arrInt có các phần tử chia hết cho 3 là: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            if (arrInt[i][j] % 3 == 0) {
                                System.out.print(arrInt[i][j] + "\t");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sum += arrInt[1][j];
                        }
                    }
                    System.out.println("Tổng các phần tử của mảng là: " + sum);
                    break;
                case 5:
                    int sumRow0 = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        sumRow0 += arrInt[0][i];
                    }

                    int max = sumRow0;

                    for (int i = 1; i < arrInt.length; i++) {
                        int sumRow = 0;
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sumRow += arrInt[i][j];
                        }
                        if (max < sumRow) {
                            max = sumRow;
                        }
                    }

                    for (int i = 0; i < arrInt.length; i++) {
                        int sumRow = 0;
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sumRow += arrInt[i][j];
                        }
                        if (sumRow == max) {
                            System.out.println("Dòng có tổng lớn nhất là " + sumRow + " và chỉ số dòng là " + i);
                        }
                    }

                case 6:
                    System.exit(0);
                default:
                    System.err.println("Hãy order chương trình có trong MENU");
                    break;
            }
        } while (true);
    }
}

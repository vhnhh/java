package RIKKEI_ACADEMY_JAVACORE_BT_OOP;

import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
//        a. Tạo mảng gồm 100 phần tử có kiểu dữ liệu là Student
        Student[] arrStudent = new Student[100];
        Scanner scanner = new Scanner(System.in);


//        b. Thực hiện hiển thị menu và thực hiện các chức năng theo menu
        int qty = 0;
        do {
            System.out.println("************MENU************\n" +
                    "1. Nhập vào thông tin sinh viên\n" +
                    "2. Tính điểm trung bình tất cả sinh viên\n" +
                    "3. Hiển thị thông tin tất cả sinh viên\n" +
                    "4. Sắp xếp sinh viên theo điểm trung bình giảm dần\n" +
                    "5. Tìm kiếm sinh viên theo tên sinh viên\n" +
                    "6. Thoát");
            System.out.print("Hãy order MENU từ 1 ~ 6: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Số lượng sinh viên bạn muốn nhập là: ");
                    int n = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < n; i++) {
                        arrStudent[qty] = new Student();
                        arrStudent[qty].inputData(scanner);
                        qty++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < qty; i++) {
                        arrStudent[i].calAvgScore();
                        System.out.println("Sinh viên " + arrStudent[i].getStudentName()+ " (" + arrStudent[i].getStudentId() + ") có điểm trung bình là: " + arrStudent[i].getAvgScore());
                    }
                    break;
                case 3:
                    for (int i = 0; i < qty; i++) {
                        arrStudent[i].displayData();
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < qty-1; i++) {
                        for (int j = 1; j < qty; j++) {
                            if(arrStudent[i].getAvgScore() < arrStudent[j].getAvgScore()) {
                                Student studentTemp = arrStudent[i];
                                arrStudent[i] = arrStudent[j];
                                arrStudent[j] = studentTemp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong sinh viên theo điểm trung bình giảm dần");
                    break;
                case 5:
                    for (int i = 0; i < qty-1; i++) {
                        for (int j = 1; j < qty; j++) {
                            if (arrStudent[i].getAvgScore()>arrStudent[j].getAvgScore()) {
                                Student studentTemp = arrStudent[i];
                                arrStudent[i] = arrStudent[j];
                                arrStudent[j] = studentTemp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong sinh viên theo điểm trung bình tăng dần");
                    break;
                case 6:
                    System.out.print("Hãy nhập tên mà bạn muốn tiềm kiếm: ");
                    String searchNameKey = scanner.nextLine();
                    boolean flag = false;
                    for (int i = 0; i < qty; i++) {
                        if (arrStudent[i].getStudentName().toLowerCase().contains(searchNameKey.toLowerCase())) {
                            arrStudent[i].displayData();
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Không có sinh viên tên '" + searchNameKey + "'" );
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}

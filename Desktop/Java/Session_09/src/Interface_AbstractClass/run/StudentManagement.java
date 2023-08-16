package Interface_AbstractClass.run;

import Interface_AbstractClass.entity.Student;

import java.util.Scanner;

public class StudentManagement {
        static Student[] student = new Student[1000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qty = 0;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Nhập thông tin n sinh viên (n nhập từ bàn phím)");
            System.out.println("2. Tính điểm trung bình tất cả sinh viên");
            System.out.println("3. Đánh giá xếp loại các sinh viên");
            System.out.println("4. Tính trạng thái của sinh viên");
            System.out.println("5. In thông tin các sinh viên");
            System.out.println("6. Sắp xếp sinh viên tăng dần theo điểm trung bình");
            System.out.println("7. Tìm kiếm sinh viên theo tên sinh viên");
            System.out.println("8. Thống kê sinh viên theo xếp loại");
            System.out.println("9. Thống kê sinh viên theo trạng thái");
            System.out.println("10. Thoát");
            System.out.println("------------------------");
            System.out.print("Bạn chọn số: ");
            int choice = Integer.parseInt(scanner.nextLine());
//            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("So luong SV ban muon nhap la: ");
                    int n = Integer.parseInt(scanner.nextLine());
//                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("---SV" + (i + 1) + "---");
                        student[qty] = new Student();
                        student[qty].inputData(scanner, student, qty);
                        qty++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < qty; i++) {
                        student[i].calAvgMark();
                        double avgScore = (double) Math.round(student[i].getAvgScore() * 100) / 100;
                        System.out.println("SV " + student[i].getStudentName() + " (" + student[i].getStudentId() + ") co diem trung binh la: " + avgScore);
                    }
                    break;
                case 3:
                    for (int i = 0; i < qty; i++) {
                        student[i].academicRank();
                        System.out.println("SV " + student[i].getStudentName() + " (" + student[i].getStudentId() + ") co xep loai la: " + student[i].getStudentRanked());
                    }
                    break;
                case 4:
                    for (int i = 0; i < qty; i++) {
                        student[i].studentStatus();
                        System.out.println("SV " + student[i].getStudentName() + " (" + student[i].getStudentId() + ") co trang thai la: " + student[i].getStudentStatus());
                    }
                    break;
                case 5:
                    for (int i = 0; i < qty; i++) {
                        System.out.println("---SV" + (i + 1) + "---");
                        student[i].displayData();
                    }
                    break;
                case 6:
                    for (int i = 0; i < qty - 1; i++) {
                        for (int j = 1; j < qty; j++) {
                            if (student[i].getAvgScore() > student[j].getAvgScore()) {
                                Student studentTempt = student[i];
                                student[i] = student[j];
                                student[j] = studentTempt;
                            }
                        }
                    }
                    System.out.println("Da sap xep xong danh sach SV theo diem trung binh giam dan.\nHay chon MENU so 5 de hien thi danh sach SV.");
                    break;
                case 7:
                    System.out.print("Hay nhap ten SV ban muon tim kiem: ");
                    String searchNameKey = scanner.nextLine();
                    boolean flag = false;
                    int count = 0;
                    for (int i = 0; i < qty; i++) {
                        if (student[i].getStudentName().toLowerCase().contains(searchNameKey.toLowerCase())) {
                            System.out.println("Danh sach SV co ten '" + searchNameKey + "':");
                            System.out.println("---SV" + (i + 1) + "---");
                            student[i].displayData();
                            flag = true;
                            count++;
                        }
                    }
                    System.out.println("Co " + count + " SV ten '" + searchNameKey + "'.");
                    if (!flag) {
                        System.out.println("Khong ton tai SV ten '" + searchNameKey + "'.");
                    }
                    break;
                case 8:
                    int xuatSacCount = 0;
                    int gioiCount = 0;
                    int khaCount = 0;
                    int trungBinhCount = 0;
                    int yeuCount = 0;
                    for (int i = 0; i < qty; i++) {
                        student[i].academicRank();
                        switch (student[i].getStudentRanked()) {
                            case "Xuất sắc":
                                xuatSacCount++;
                                break;
                            case "Giỏi":
                                gioiCount++;
                                break;
                            case "Khá":
                                khaCount++;
                                break;
                            case "Trung bình":
                                trungBinhCount++;
                                break;
                            default:
                                yeuCount++;
                                break;
                        }

                    }
                    System.out.println("SV xep loai Xuất sắc: " + xuatSacCount + "\nSV xep loai Giỏi: " + gioiCount + "\nSV xep loai Khá: " + khaCount + "\nSV xep loai Trung bình: " + trungBinhCount + "\nSV xep loai Yếu: " + yeuCount);


                    break;
                case 9:
                    int passCount = 0;
                    int failCount = 0;
                    for (int i = 0; i < qty; i++) {
                        student[i].studentStatus();
                        switch (student[i].getStudentStatus()) {
                            case "PASS":
                                passCount++;
                                break;
                            default:
                                failCount++;
                                break;
                        }
                    }
                    System.out.println("SV PASS: " + passCount + "\nSV FAIL: " + failCount);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("Hay chon so tu 1~10");
            }
        } while (true);
    }
}

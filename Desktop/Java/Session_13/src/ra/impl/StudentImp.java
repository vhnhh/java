package ra.impl;

import ra.entity.Student;

import java.io.*;
import java.util.*;

public class StudentImp {
    public static List<Student> studentList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readDataFromFile();
        do {
//            if (studentList.size() == 0) {
//                System.out.println("HIỆN DANH SÁCH SINH VIÊN TRỐNG.");
//            } else {
//                System.out.println();
//                System.out.println("---DANH SÁCH SINH VIÊN---");
//                for (int i = 0; i < studentList.size(); i++) {
//                    System.out.print(i + 1 + ". ");
//                    studentList.get(i).displayData();
//                }
//            }
            System.out.println();
            System.out.println("*****************MENU*****************");
            System.out.println("1. Nhập thông tin các sinh viên.");
            System.out.println("2. Tính tuổi các sinh viên.");
            System.out.println("3. Tính điểm trung bình và xếp loại sinh viên.");
            System.out.println("4. Sắp xếp sinh viên theo tuổi tăng dần.");
            System.out.println("5. Thống kê sinh viên theo xếp loại sinh viên.");
            System.out.println("6. Cập nhật thông tin sinh viên theo mã sinh viên.");
            System.out.println("7. Tìm kiếm sinh viên theo tên sinh viên.");
            System.out.println("8. Thoát");
            System.out.println("======================================");
            System.out.print("Bạn chọn số: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    calStudentAge();
                    break;
                case 3:
                    for (Student student : studentList) {
                        student.calAvgMark_Rank();
                    }
                    System.out.println("Đã tính xong điểm trung bình và xếp loại cho tất cả các sinh viên");
                    break;
                case 4:
                    sortAgeAscending();
                    break;
                case 5:
                    statisticalRank();
                    break;
                case 6:
                    editStudentInfo();
                    break;
                case 7:
                    searchStudentName();
                    break;
                case 8:
                    writeDataToFile();
                    System.exit(0);
                    break;
                default:
                    System.err.println("MENU chỉ gồm chương trình từ 1 ~ 8. Vui lòng nhập lại.");

            }
        } while (true);
    }

    public static void readDataFromFile() {
        File file = new File("studentList.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            if (file.length()>0) {
                studentList = (List<Student>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Không thể truy cập đến file.");
        } catch (Exception e) {
            System.out.println("Xảy ra lỗi khi đọc từ file");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Lỗi runtime");
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Lỗi IO");
                }
            }
        }
    }

    public static void writeDataToFile() {
        File file = new File("studentList.txt");
        System.out.println(file.exists());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        } catch (IOException e) {
            System.out.println("Không thể truy cập đến file.");
        } catch (Exception e) {
            System.out.println("Xảy ra lỗi khi nhập vào file");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Lỗi runtime");
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Lỗi IO");

                }
            }
        }
    }

    public static void addStudent() {
        System.out.print("số lượng SV bạn muốn nhập là: ");
        int qty = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qty; i++) {
            Student student = new Student();
            student.inputData();
            studentList.add(student);
        }
    }

    public static void calStudentAge() {
        for (Student student : studentList) {
            student.calAge();
        }
        System.out.println("Đã tính tuổi các sinh viên.");
    }

    public static void sortAgeAscending() {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("Đã sắp xếp sinh viên theo tuổi tăng dần.");
    }

    public static void statisticalRank() {
        int xuatSacCount = 0;
        int gioiCount = 0;
        int khaCount = 0;
        int trungBinhCount = 0;
        int yeuCount = 0;
        for (Student student : studentList) {
            student.calAvgMark_Rank();
            switch (student.getRank()) {
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
    }

    public static void editStudentInfo() {
        System.out.print("Nhập mã SV của SV cần cập nhật: ");
        String searchStudentId = scanner.nextLine();
        if (studentList.size() > 0) {
            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);
                if (student.getStudentId().equals(searchStudentId)) {
                    student.displayData();
                    studentList.get(i).setStudentName(Student.validateStudentName());
                    studentList.get(i).setBirthday(Student.validateBirthday());
                    studentList.get(i).setSex(Student.validateSex());
                    studentList.get(i).setMark_html(Student.validateHtmlMark());
                    studentList.get(i).setMark_css(Student.validateCssMark());
                    studentList.get(i).setMark_javascript(Student.validateJavascriptMark());
                    System.out.println("Cập nhật thông tin SV thành công.");
                } else {
                    System.out.println("Không tồn tại danh mục mang mã '" + searchStudentId + "'");
                }
            }
        } else {
            System.out.println("Danh sách SV trống.");
        }
    }

    public static void searchStudentName() {
        String searchKey = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getStudentName().toLowerCase().contains(searchKey.toLowerCase())) {
                student.displayData();
            }
        }
    }
}

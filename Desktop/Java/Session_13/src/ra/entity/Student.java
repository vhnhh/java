package ra.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static ra.impl.StudentImp.scanner;
import static ra.impl.StudentImp.studentList;

public class Student implements IEntity, Serializable {
    private String studentId;
    private String studentName;
    private LocalDate birthday;
    private int age;
    private boolean sex;
    private float mark_html;
    private float mark_css;
    private float mark_javascript;
    private float mark_avg;
    private String rank;

    public Student() {

    }

    public Student(String studentId, String studentName, LocalDate birthday, int age, boolean sex, float mark_html,
                   float mark_css, float mark_javascript, float mark_avg, String rank) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
        this.mark_html = mark_html;
        this.mark_css = mark_css;
        this.mark_javascript = mark_javascript;
        this.mark_avg = mark_avg;
        this.rank = rank;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getMark_html() {
        return mark_html;
    }

    public void setMark_html(float mark_html) {
        this.mark_html = mark_html;
    }

    public float getMark_css() {
        return mark_css;
    }

    public void setMark_css(float mark_css) {
        this.mark_css = mark_css;
    }

    public float getMark_javascript() {
        return mark_javascript;
    }

    public void setMark_javascript(float mark_javascript) {
        this.mark_javascript = mark_javascript;
    }

    public float getMark_avg() {
        return mark_avg;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public void inputData() {
        this.studentId = validateStudentId();
        this.studentName = validateStudentName();
        this.birthday = validateBirthday();
        this.sex = validateSex();
        this.mark_html = validateHtmlMark();
        this.mark_css = validateCssMark();
        this.mark_javascript = validateJavascriptMark();
    }

    public static String validateStudentId() {
        do {
            System.out.print("Mã sinh viên: ");
            String studentId = scanner.nextLine();
            if (studentId.length() == 4) {
                if (studentId.startsWith("S")) {
                    boolean isExist = false;
                    for (Student student : studentList) {
                        if (student.getStudentId().equals(studentId)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (isExist) {
                        System.out.println("Mã sinh viên đã tồn tại. Vui lòng nhập lại.");
                    } else {
                        return studentId;
                    }
                } else {
                    System.out.println("Mã SV phải bắt đầu bằng ký tự 'S'. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Mã SV phải gồm 4 kí tự. Vui lòng nhập lại.");
            }
        } while (true);
    }

    public static String validateStudentName() {
        do {
            System.out.print("Tên sinh viên: ");
            String studentName = scanner.nextLine();
            if (studentName.length() >= 10 && studentName.length() <= 50) {
                return studentName;
            } else {
                System.out.println("Tên sinh viên có độ dài từ 10-50 ký tự. Vui lòng nhập lại.");
            }
        } while (true);
    }

    public static LocalDate validateBirthday() {
        do {
            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate birthday = LocalDate.parse(scanner.nextLine(), dateFormat);
//                Calendar calendar = Calendar.getInstance();
//                calendar.setTime(birthday);
                if (birthday.getYear() < 2005) {
                    return birthday;
                } else {
                    System.out.println("Năm sinh phải trước năm 2005, vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.out.println("Xảy ra lỗi không xác định, vui lòng liên hệ với hệ thống.");
            }
        } while (true);
    }

    public static boolean validateSex() {
        do {
            System.out.print("Giới tính sinh viên: ");
            String sex = scanner.nextLine();
            if (sex.equalsIgnoreCase("true") || sex.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(sex);
            } else {
                System.out.println("Giới tính chỉ nhận giá trị true | false. Vui lòng nhập lại.");
            }
        } while (true);
    }

    public static float validateHtmlMark() {
        do {
            try {
                System.out.print("Điểm html: ");
                float mark_html = Integer.parseInt(scanner.nextLine());
                if (mark_html >= 0 && mark_html <= 10) {
                    return mark_html;
                } else {
                    System.out.println("Điểm HTML thang số 10 (0~10). Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Điểm HTML không phải định dạng số thực. Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định. Vui lòng liên hệ hệ thống.");
            }
        } while (true);
    }

    public static float validateCssMark() {
        do {
            try {
                System.out.print("Điểm css: ");
                float mark_css = Integer.parseInt(scanner.nextLine());
                if (mark_css >= 0 && mark_css <= 10) {
                    return mark_css;
                } else {
                    System.out.println("Điểm CSS thang số 10 (0~10). Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Điểm CSS không phải định dạng số thực. Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định. Vui lòng liên hệ hệ thống.");
            }
        } while (true);
    }

    public static float validateJavascriptMark() {
        do {
            try {
                System.out.print("Điểm javascript: ");
                float mark_javascript = Integer.parseInt(scanner.nextLine());
                if (mark_javascript >= 0 && mark_javascript <= 10) {
                    return mark_javascript;
                } else {
                    System.out.println("Điểm Javascript trong khoảng 0~10. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Điểm Javascript thang số 10 (0~10). Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định. Vui lòng liên hệ hệ thống.");
            }
        } while (true);
    }


    @Override
    public void displayData() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Ngày sinh: " + dateFormat.format(this.birthday));
        System.out.println("Tuổi SV: " + this.age);
        System.out.println("Giới tính sinh viên: " + this.sex);
        System.out.println("Điểm html: " + this.mark_html);
        System.out.println("Điểm css: " + this.mark_css);
        System.out.println("Điểm javascript: " + this.mark_javascript);
        System.out.println("Điểm trung bình: " + this.mark_avg);
        System.out.println("Xếp loại: " + this.rank);

//        String strSex = this.sex ? "Nam" : "Nữ";
//        System.out.printf("StudentId: %s - Student Name: %s - BirthDay: %td-%tb-%tY - Age: %d\n", this.studentId, this.studentName, this.birthday,this.birthday,this.birthday, this.age);
//        System.out.printf("Sex: %s - HTML: %f - CSS: %f - Javascript: %f - Avg Mark: %f - Rank: %s\n", strSex, this.mark_html, this.mark_css, this.mark_javascript, this.mark_avg, this.rank);
    }

    @Override
    public void calAge() {
        LocalDate localDate = LocalDate.now();
        int now = localDate.getYear();
        System.out.println(now);
        System.out.println(this.birthday);
        this.age = now - this.birthday.getYear();
    }

    @Override
    public void calAvgMark_Rank() {
        this.mark_avg = (mark_html + mark_css + mark_javascript) / 3;
        if (this.mark_avg < 5) {
            this.rank = "Yếu";
        } else if (this.mark_avg >= 5 && this.mark_avg < 7) {
            this.rank = "Trung bình";
        } else if (this.mark_avg >= 7 && this.mark_avg < 8) {
            this.rank = "Khá";
        } else if (this.mark_avg >= 9) {
            this.rank = "Xuất sắc";
        } else {
            this.rank = "Giỏi";
        }
    }
}

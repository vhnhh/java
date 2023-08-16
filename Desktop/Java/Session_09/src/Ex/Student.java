package Ex;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int studentAge;
    private float htmlScore, cssScore, javascriptScore;
    private float avgScore;
    private boolean studentSex;
    private String studentRanked;
    private String studentStatus;

    public Student() {

    }

    public Student(String studentId, String studentName, int studentAge, float htmlScore, float cssScore, float javascriptScore, float avgScore, boolean studentSex, String studentRanked, String studentStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
        this.avgScore = avgScore;
        this.studentSex = studentSex;
        this.studentRanked = studentRanked;
        this.studentStatus = studentStatus;
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

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public float getAvg() {
        return avgScore;
    }

    public void setAvg(float avg) {
        this.avgScore = avg;
    }

    public boolean isStudentSex() {
        return studentSex;
    }

    public void setStudentSex(boolean studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentRanked() {
        return studentRanked;
    }

    public void setStudentRanked(String studentRanked) {
        this.studentRanked = studentRanked;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    @Override
    public void inputData(Scanner scanner) {
        do {
            System.out.print("Mã sinh viên: ");
            this.studentId = scanner.nextLine();

            if (this.studentId.length() == 4 && this.studentId.startsWith("SV")) {
                break;
            } else {
                System.out.println("Mã sinh viên không đúng. Mã sinh viên gồm 4 ký tự bắt đầu là “SV”. Vui lòng nhập lại.");
            }
        } while (true);
        do {
            System.out.print("Tên sinh viên: ");
            this.studentName = scanner.nextLine();
            if (this.studentName.length() > 6 && this.studentName.length() < 50) {
                break;
            } else {
                System.out.println("Tên sinh viên không đúng. Tên sinh viên gồm 6~50 ký tự. Vui lòng nhập lại.");
            }
        } while (true);
        do {
            System.out.print("Tuổi sinh viên: ");
            this.studentAge = Integer.parseInt(scanner.nextLine());
            if (this.studentAge >= 18) {
                break;
            } else {
                System.out.println("Tuổi sinh viên không đúng. Tuổi sinh viên phải từ 18 trở lên. Vui lòng nhập lại.");
            }
        } while (true);
        do {
            System.out.print("Điểm html: ");
            this.htmlScore = Integer.parseInt(scanner.nextLine());
            System.out.print("Điểm css: ");
            this.cssScore = Integer.parseInt(scanner.nextLine());
            System.out.print("Điểm javascript: ");
            this.javascriptScore = Integer.parseInt(scanner.nextLine());
            if ((this.htmlScore > 0 && this.htmlScore < 10) && (this.cssScore > 0 && this.cssScore < 10) && (this.javascriptScore > 0 && this.javascriptScore < 10)) {
                break;
            } else {
                System.out.println("Điểm có giá trị trong khoảng 0-10. Vui lòng nhập lại.");
            }
        } while (true);

        System.out.print("Giới tính sinh viên");
        this.studentSex = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Mã SV: " + this.studentId);
        System.out.println("Tên SV: " + this.studentName);
        System.out.println("Tuổi SV: " + this.studentAge);
        System.out.println("Điểm HTML: " + this.htmlScore);
        System.out.println("Điểm CSS: " + this.cssScore);
        System.out.println("Điểm Javascript: " + this.javascriptScore);
        System.out.print("Giới tinh SV: ");
        System.out.print(this.studentSex ? "Nam" : "Nữ");
    }

    @Override
    public float calAvgMark() {
        return this.avgScore = (htmlScore + cssScore + javascriptScore) / 3;
    }

    public void academicRank() {
        if (calAvgMark()>=0&&calAvgMark()<5) {
            this.studentRanked = "Yếu";
        } else if (calAvgMark()>=5&&calAvgMark()<7) {
            this.studentRanked = "Trung bình";
        } else if (calAvgMark()>=7&&calAvgMark()<8) {
            this.studentRanked = "Khá";
        } else if (calAvgMark()>=8&&calAvgMark()<9) {
            this.studentRanked = "Giỏi";
        } else {
            this.studentRanked = "Xuất sắc";
        }
    }

    public void studentStatus() {
        if (calAvgMark()>=this.MARK_PASS) {
            this.studentStatus="PASS";
        } else {
            this.studentStatus="FAIL";
        }
    }


}

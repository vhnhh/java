package RIKKEI_ACADEMY_JAVACORE_BT_OOP;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;

    public Student() {

    }

    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore, float avgScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
        this.avgScore = avgScore;
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

    public float getAvgScore() {
        return avgScore;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập vào mã sinh vien: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập vào tên sinh vien: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập vào tuổi sinh vien: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào giới tính sinh vien: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập vào điểm HTML: ");
        this.htmlScore = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào điểm CSS: ");
        this.cssScore = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào điểm Javascript: ");
        this.javascriptScore = Integer.parseInt(scanner.nextLine());
    }

    public void displayData() {
        String sexDisplay= this.sex?"Nữ":"Nam";
        System.out.printf("Mã sinh viên: %s\t\tTên sinh viên: %s\tTuổi sinh viên: %d\tGiới tính: %b\tĐiểm HTML: %.1f\tĐiểm CSS: %.1f\tĐiểm Javascript: %.1f\tĐiểm trung bình: %.1f\n", studentId, studentName, age, sexDisplay, htmlScore, cssScore, javascriptScore, avgScore);
    }

//    public float calAvgScore(float htmlScore, float cssScore, float javascriptScore) {
//        return (htmlScore + cssScore + javascriptScore) / 3;
//    }

    public void calAvgScore() {
        this.avgScore = (this.htmlScore + this.cssScore + this.javascriptScore) / 3;
    }

//    public void setAvgScore(float avgScore) {
//        this.avgScore = this.calAvgScore(this.htmlScore, this.cssScore, this.javascriptScore);
//    }

}


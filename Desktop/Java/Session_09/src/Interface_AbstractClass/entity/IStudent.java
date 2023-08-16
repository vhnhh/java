package Interface_AbstractClass.entity;

import java.util.Scanner;

public interface IStudent {
    byte MARK_PASS = 5;
    void inputData(Scanner scanner, Student[] student, int qty);
    void displayData();
    float calAvgMark();
}

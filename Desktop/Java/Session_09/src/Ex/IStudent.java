package Ex;

import java.util.Scanner;

public interface IStudent {
    byte MARK_PASS = 5;
    void inputData(Scanner scanner);
    void displayData();
    float calAvgMark();
}

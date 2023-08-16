import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT_bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap vao 1 chuoi: ");
        String str = scanner.nextLine();


//        string.matches(.{1});
//        String regex = ".+?";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(string);
//        if (matcher.matches()) {
//            System.out.println("cac ki tu xuat hien 1 lan la: ");
//            System.out.println();
//        } else {
//            System.out.println("khong dung");
//        }


        int[] count = new int[256];
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)]==1 && str.charAt(i) !=' ') {
                System.out.println("ki tu chi xuat hien 1 lan: " + str.charAt(i));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("khong co ki tu nao xuat hien 1 lan");
        }
    }
}

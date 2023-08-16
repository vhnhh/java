import java.util.Scanner;

public class BT_bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap vao 1 chuoi ki tu: ");
        String str = scanner.nextLine();

//        a. Không có khoảng trắng ở 2 đầu
        System.out.println(str.trim());

//        b. Mỗi từ cách nhau 1 khoảng trắng
        System.out.println(str.replaceAll("\\s\\s+", " "));

//        c. Ký tự đầu tiên của mỗi từ được viết hoa, các ký tự khác viết thường
        char[] ch = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])){
                if (flag) {
                    ch[i] = Character.toUpperCase(ch[i]);
                    flag = false;
                } else {
                    ch[i] = Character.toLowerCase(ch[i]);
                }
            } else {
                flag = true;
            }
        }
        System.out.println(ch);
    }
}

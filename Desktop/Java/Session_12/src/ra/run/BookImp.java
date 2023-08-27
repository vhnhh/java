package ra.run;

import ra.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImp {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("************MENU************");
            System.out.println("1. Nhập thông tin các sách.");
            System.out.println("2. In thông tin các sách ra file demo.txt.");
            System.out.println("3. Đọc file demo.txt và in ra các sách có giá trong khoảng 10000 đến 20000.");
            System.out.println("4. Thoát.");
            System.out.println("============================");
            System.out.print("Bạn chọn số: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    BookImp.writeDataToFile();
                    System.out.println("Đã in vào File.");
                    break;
                case 3:
                    List<Book> booksListRead = readDataFromFile();
                    for (int i = 0; i < booksListRead.size(); i++) {
                        if (booksListRead.get(i).getPrice() >= 10000 && booksListRead.get(i).getPrice() <= 20000) {
                            System.out.println("-Book" + i + 1 + "-");
                            System.out.println(booksListRead.get(i));
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Chỉ được chọn từ 1 ~ 4. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }


    public static void addBook() {
        System.out.print("Số lượng sách bạn muốn thêm: ");
        int qty = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qty; i++) {
            Book books = new Book();
            System.out.println("-Book" + i + 1 + "-");
            books.inputData();
            bookList.add(books);
        }
    }

    public static void writeDataToFile() {
        File file = new File("ex.txt");
//        System.out.println(file.exists());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookList);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File khong ton tai.");
        } catch (IOException e) {
            System.err.println("Loi khi ghi du lieu ra file.");
        } catch (Exception e) {
            System.err.println("Xay ra loi trong qua trinh ghi du lieu.");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.err.println("Xay ra loi khi dong cac stream.");
            } catch (Exception e) {
                System.out.println("Xay ra loi trong qua trinh dong cac stream.");
            }
        }
    }

    public static List<Book> readDataFromFile() {
        File file = new File("ex.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Book> booksFromTxt = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            booksFromTxt = (List<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Khong ton tai file.");
        } catch (IOException e) {
            System.err.println("Loi khi doc file.");
        } catch (Exception e) {
            System.err.println("Co loi trong qua trinh doc du lieu tu file.");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.err.println("Co loikhi dong stream.");
            } catch (Exception e) {
                System.err.println("Co loi trong qua trinh dong cac stream.");
            }
        }
        return booksFromTxt;
    }
}

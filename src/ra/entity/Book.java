package ra.entity;

import java.io.Serializable;

import static ra.run.BookImp.scanner;
public class Book implements Serializable {
    private String bookId;
    private  String bookName;
    private float price;

    public Book() {

    }

    public Book(String bookId, String bookName, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void inputData() {
        System.out.print("Nhập vào mã sách: ");
        this.bookId = scanner.nextLine();
        System.out.print("Nhập vào tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.print("Nhập vào giá sách: ");
        this.price = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "bookId = '" + bookId + "'\nbookName = '" + bookName + "'\nprice = " + price;
    }
}

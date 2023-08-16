package COLLECTIONS_BT_Tong_Hop.entity;

import java.util.Scanner;

import static COLLECTIONS_BT_Tong_Hop.run.ShopManagement.*;

public class Product implements IShop {
    private String productId;
    private String productName;
    private float price;
    private String title;
    private int catalogId;
    private boolean status;

    public Product() {

    }

    public Product(String productId, String productName, float price, String title, int catalogId, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.title = title;
        this.catalogId = catalogId;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {

        do {
            System.out.print("Tên sản phẩm: ");
            String checkProductName = scanner.nextLine();
            boolean isExist = false;
            for (Product product : productList) {
                if (product.getProductName().equals(checkProductName)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.println("Tên sản phẩm đã tồn tại. Vui lòng nhập một tên sản phẩm khác.");
            } else {
                this.productName = checkProductName;
                break;
            }
        } while (true);

        do {
            System.out.print("Mã sản phẩm: ");
            String checkProductId = scanner.nextLine();
        if (checkProductId.length() == 5 && checkProductId.startsWith("P")) {
            boolean isExist = false;
            for (Product product : productList) {
                if (product.getProductId().equals(checkProductId)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.println("Sản phẩm này đã tồn tại. Vui lòng nhập lại mã sản phẩm.");
            } else {
                this.productName = checkProductId;
                break;
            }
        } else {
            System.out.println("Mã sản phẩm không đúng. Vui lòng nhập lại.\nMã sản phẩm gồm 5 ký tự bắt đầu là 'P'.");
        }
    } while (true);
        System.out.print("Mã sản phẩm: ");
        this.productId = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        this.price=Float.parseFloat(scanner.nextLine());
        System.out.print("Tiêu đề sản phẩm: ");
        this.title=scanner.nextLine();
        System.out.print("Trạng thái: ");
        this.status=Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Mã sản phẩm: " + this.productId);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Tiêu đề sản phẩm: " + this.title);
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Trạng thái: " + this.status);

    }
}

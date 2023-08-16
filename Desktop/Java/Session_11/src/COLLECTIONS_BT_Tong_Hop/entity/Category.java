package COLLECTIONS_BT_Tong_Hop.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static COLLECTIONS_BT_Tong_Hop.run.ShopManagement.scanner;
import static COLLECTIONS_BT_Tong_Hop.run.ShopManagement.categoryList;

public class Category implements IShop {
    private String catalogName;
    private int catalogId;
    private boolean status;

    public Category() {

    }

    public Category(int catalogId, String catalogName, boolean status) {
        this.catalogName = catalogName;
        this.catalogId = catalogId;
        this.status = status;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
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
            System.out.print("Tên danh mục: ");
            String checkCatalogName = scanner.nextLine();
            boolean isExist = false;
            for (Category category : categoryList) {
                if (category.getCatalogName().equals(checkCatalogName)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.println("Tên danh mục đã tồn tại. Vui lòng nhập một tên danh mục khác.");
            } else {
                this.catalogName = checkCatalogName;
                break;
            }
        } while (true);

        do {
            System.out.print("Mã danh mục: ");
            int checkCatalogId = Integer.parseInt(scanner.nextLine());
            boolean isExist = false;
            for (Category category : categoryList) {
                if (category.getCatalogId()==checkCatalogId) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.println("Danh mục này đã tồn tại. Vui lòng nhập lại mã danh mục.");
            } else {
                this.catalogId = checkCatalogId;
                break;
            }
        } while (true);

        System.out.print("Trạng thái: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Tên danh mục: " + this.catalogName);
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Trạng thái: " + this.status);
    }
}

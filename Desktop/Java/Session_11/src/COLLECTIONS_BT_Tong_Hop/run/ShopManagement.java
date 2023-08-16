package COLLECTIONS_BT_Tong_Hop.run;

import COLLECTIONS_BT_Tong_Hop.entity.Category;
import COLLECTIONS_BT_Tong_Hop.entity.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static List<Category> categoryList = new ArrayList<>();
    public static List<Product> productList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("**********SHOP_MANAGEMENT**********");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("-----------------------------------");
            System.out.print("Bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ShopManagement.catalogMenu(scanner);
                    break;
                case 2:
                    ShopManagement.productMenu(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng nhập lại.");
                    break;
            }
        } while (true);
    }

    //MENU catalog
    public static void catalogMenu(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("**********PRODUCT_MANAGEMENT**********");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật tên danh mục theo mã danh mục");
            System.out.println("4. Xóa danh mục theo mã danh mục");
            System.out.println("5. Quay lại");
            System.out.println("--------------------------------------");
            System.out.print("Bạn chọn số: ");
            int choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    ShopManagement.addCatalog();
                    break;
                case 2:
                    ShopManagement.displayCategoryList();
                    break;
                case 3:
                    ShopManagement.editCategoryName();
                    break;
                case 4:
                    ShopManagement.delCategory();
                    break;
                case 5:
                    isExit = false;
                    break;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng nhập lại.");
                    break;
            }
        } while (isExit);
    }


    public static void addCatalog() {
        System.out.print("Số lượng danh mục bạn muốn thêm: ");
        int qtyCategory = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtyCategory; i++) {
            Category category = new Category();
            category.inputData();
            categoryList.add(category);
        }
    }

    public static void displayCategoryList() {
        if (categoryList.size() == 0) {
            System.out.println("Danh sách các danh mục hiện trống.");
        } else {
            System.out.println("--Danh sách các danh mục--");
            int countCategory = 0;
            for (Category category : categoryList) {
                System.out.println("--Sản phẩm " + (countCategory + 1) + "--");
                category.displayData();
                countCategory++;
            }
            System.out.println("Hiện có tất cả '" + (countCategory) + "' danh mục");
        }
    }

    public static void editCategoryName() {
        System.out.print("Nhập vào mã danh mục: ");
        int searchCategoryId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < categoryList.size(); i++) {
            Category category = categoryList.get(i);
            if (category.getCatalogId() == searchCategoryId) {
                category.displayData();
                System.out.print("Cập nhật tên danh mục: ");
                String newCategoryName = scanner.nextLine();
                category.setCatalogName(newCategoryName);
                categoryList.set(i, category);
                System.out.println("Cập nhật tên danh mục thành công.");
            } else {
                System.out.println("Không tồn tại danh mục mang mã '" + searchCategoryId + "'");
            }
        }
    }

    public static void delCategory() {
        System.out.print("Nhập vào mã danh mục: ");
        int searchCategoryId = Integer.parseInt(scanner.nextLine());
        boolean isExistProduct = false;
        boolean isExistCategory = false;
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getCatalogId() == searchCategoryId) {
                isExistCategory = true;
                for (Product product : productList) {
                    if (product.getCatalogId() == searchCategoryId) {
                        isExistProduct = true;
                        break;
                    }
                    //                        category.displayData();
                    //                        System.out.print("Bạn có chắc muốn xóa danh mục này (boolean): ");
                    //                        boolean del = Boolean.parseBoolean(scanner.nextLine());
                    //                        if (del) {
                    //
                    //                        }
//                    isExistProduct = category.getCatalogId() == product.getCatalogId();
                }
                if (!isExistProduct) {
                    categoryList.get(i).displayData();
                    System.out.print("Bạn có chắc muốn xóa danh mục này (boolean): ");
                    boolean del = Boolean.parseBoolean(scanner.nextLine());
                    if (del) {
                        categoryList.remove(i);
                        System.out.println("Xóa danh mục thành công.");
                    }
                } else {
                    System.out.println("Danh mục này tồn tại danh sách sản phẩm. Không được xóa danh mục này.");
                }
                break;
            }
        }
        if (!isExistCategory) {
            System.out.println("Không tồn tại danh mục mang mã '" + searchCategoryId + "'");
        }
    }
//end MENU catalog

    //MENU product
    public static void productMenu(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("**********CATALOG_MANAGEMENT**********");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Cập nhật giá sản phẩm theo mã sản phẩm");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
            System.out.println("6. Sắp xếp sản phẩm theo tên tăng dần");
            System.out.println("7. Thống kê số lượng sản phẩm theo danh mục sản phẩm");
            System.out.println("8. Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("9. Quay lại");
            System.out.println("--------------------------------------");
            System.out.print("Bạn chọn số: ");
            int choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2) {
                case 1:
                    ShopManagement.addProduct();
                    break;
                case 2:
                    ShopManagement.displayProductList();
                    break;
                case 3:
                    ShopManagement.editProductPrice();
                    break;
                case 4:
                    ShopManagement.delProduct();
                    break;
                case 5:
                    ShopManagement.sortPriceAscending();
                    break;
                case 6:
                    ShopManagement.sortNameAscending();
                    break;
                case 7:
                    ShopManagement.statisticsNumberOfProducts();
                    break;
                case 8:
                    ShopManagement.searchProductByName();
                    break;
                case 9:
                    isExit = false;
                    break;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng nhập lại.");
                    break;
            }
        } while (isExit);
    }


    public static void addProduct() {

//        1. display category
//        2. chon danh muc(theo stt)
//        3.


        if (categoryList.size() != 0) {
            System.out.println("--Danh sách các danh mục--");
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println((i + 1) + ". " + categoryList.get(i).getCatalogName());
            }
            System.out.print("Chọn danh mục bạn muốn thêm sản phẩm: ");
            int chosenCategory = Integer.parseInt(scanner.nextLine());
            Category category = categoryList.get(chosenCategory - 1);
            category.displayData();
            System.out.print("Đây là danh mục bạn muốn cập nhật sản phẩm (boolean): ");
            boolean create = Boolean.parseBoolean(scanner.nextLine());
            if (create) {
                System.out.print("Số lượng sản phẩm bạn muốn thêm: ");
                int qtyProduct = Integer.parseInt(scanner.nextLine());
                for (int j = 0; j < qtyProduct; j++) {
                    Product product = new Product();
                    product.inputData();
                    productList.add(product);
                    product.setCatalogId(category.getCatalogId());
                }
                System.out.println("Cập nhật sản phẩm thành công.");
            }
        } else {
            System.out.println("Không tồn tại danh mục nào. Không thể cập nhật sản phẩm.");
        }
    }


    public static void displayProductList() {
        if (productList.size() == 0) {
            System.out.println("Danh sách sản phẩm hiện trống.");
        } else {
            System.out.println("--Danh sách các sản phẩm--");
            int countProduct = 0;
            for (Product product : productList) {
                System.out.println("--Sản phẩm " + (countProduct + 1) + "--");
                product.displayData();
                countProduct++;
            }
            System.out.println("Hiện có tất cả '" + (countProduct) + "' sản phẩm");
        }
    }


    public static void editProductPrice() {
        System.out.print("Nhập vào mã sản phẩm: ");
        String searchProductId = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductId().equals(searchProductId)) {
                product.displayData();
                System.out.print("Cập nhật giá sản phẩm: ");
                float newProductPrice = Float.parseFloat(scanner.nextLine());
                product.setPrice(newProductPrice);
                productList.set(i, product);
                System.out.println("Cập nhật giá sản phẩm thành công.");
            } else {
                System.out.println("Không tồn tại sản phẩm mang mã '" + searchProductId + "'");
            }
        }
    }


    public static void delProduct() {
        System.out.print("Nhập vào mã sản phẩm: ");
        String searchProductId = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductId().equals(searchProductId)) {
                product.displayData();
                System.out.print("Bạn có chắc muốn xóa sản phẩm này (boolean): ");
                boolean del = Boolean.parseBoolean(scanner.nextLine());
                if (del) {
                    productList.remove(i);
                    System.out.println("Xóa sản phẩm thành công.");
                }
            }
        }
    }


    public static void sortPriceAscending() {
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = i + 1; j < productList.size(); j++) {
                if (productList.get(i).getPrice() > productList.get(j).getPrice()) {
                    Product productTemp = productList.get(i);
                    productList.set(i, productList.get(j));
                    productList.set(j, productTemp);
                }
            }
        }
        System.out.println("Đã sắp xếp sản phẩm theo giá tăng dần.\nChọn MENU '2' để hiển thị danh sách.");
    }


    public static void sortNameAscending() {
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = i + 1; j < productList.size(); j++) {
                if (productList.get(i).getProductName().compareToIgnoreCase(productList.get(j).getProductName()) > 0) {
                    Product productTemp = productList.get(i);
                    productList.set(i, productList.get(j));
                    productList.set(j, productTemp);
                }
            }
        }
        System.out.println("Đã sắp xếp sản phẩm theo tên tăng dần.\nChọn MENU '2' để hiển thị danh sách.");
    }


    public static void statisticsNumberOfProducts() {
        for (Category category : categoryList) {
            int countProduct = 0;
            for (Product product : productList) {
                if (category.getCatalogId() == product.getCatalogId()) {
                    countProduct++;
                }
            }
            System.out.println("Danh mục " + category.getCatalogName() + " gồm " + countProduct + " sản phẩm.");
        }
    }


    public static void searchProductByName() {
        System.out.print("Nhập vào tên sản phẩm bạn muốn tìm kiếm: ");
        String searchKey = scanner.nextLine();
        boolean isExist = false;
        int countProduct = 0;
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(searchKey.toLowerCase())) {
                isExist = true;
                product.displayData();
                countProduct++;
            }
        }
        if (isExist) {
            System.out.println("Có " + countProduct + " sản phẩm thỏa mãn điều kiện tìm kiếm.");
        } else {
            System.out.println("Không có sản phẩm nào thỏa mãn điều kiện tìm kiếm.");
        }
    }

//end MENU product

}

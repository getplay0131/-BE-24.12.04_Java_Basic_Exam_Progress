package Exam_241126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOrderRefactoring_improvement_inputData_1 {
        static int maxProducts = 10;
        static int productsCount = 0;

        public static void main(String[] args) throws IOException{
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        ProductOrder [] productList = new ProductOrder[maxProducts];
            System.out.print("입력할 주문의 개수를 입력하세요 : " );
            int productInputCount = Integer.parseInt(scan.readLine());
            for (int i = 0; i < productInputCount; i++) {
            productList[i] = inputData(scan, i);
            addProduct(productList,productList[i].productName, productList[i].price, productList[i].quantity);
            }

    printOrders(productList);
    getTotalAmount(productList);
    }

    static ProductOrder inputData(BufferedReader reader, int count) throws IOException {
        ProductOrder orders = new ProductOrder();
        while (true) {
        System.out.println((count+1) + "번째 주문의 개수를 입력하세요." );
            System.out.print("상품명 : ");
            orders.productName = reader.readLine();
            if (orders.productName.isEmpty()) {
                System.out.println("상품명을 입력해주세요!");
                continue;
            } else {
                System.out.print("가격 : ");
                orders.price = Integer.parseInt(reader.readLine());
                if (orders.price == 0) {
                    System.out.println("상품 가격을 입력해주세요!");
                    continue;
                }
                System.out.print("수량 : ");
                orders.quantity = Integer.parseInt(reader.readLine());
                if (orders.quantity == 0) {
                    System.out.println("상품 가격을 입력해주세요!");
                    continue;
                }
            }
            break;
        }
        return orders;
    }

    static void addProduct(ProductOrder[] products, String productName, int price, int quantity){
        if (productsCount >= maxProducts) {
            System.out.println("더 이상 상품 등록이 불가합니다.");
            return;
        }
            ProductOrder newProduct = createProduct(productName,price,quantity);
            products[productsCount] = newProduct;
            productsCount++;

    }

    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder Products = new ProductOrder();
        initProduct(Products,productName,price,quantity);
        return Products;
    }

    static void initProduct (ProductOrder Product, String productName, int price, int quantity) {
        Product.productName = productName;
        Product.price = price;
        Product.quantity = quantity;

        }

        static void printOrders(ProductOrder[] orders) {
            for (int i = 0; i < productsCount; i++) {
                ProductOrder product = orders[i];
                System.out.println("상품명 : " + product.productName + ", 가격 : " + product.price + ", 수량 : " + product.quantity);
            }

        }

        static int getTotalAmount(ProductOrder[] orders) {
            int sum = 0;
            for (int i = 0; i < productsCount; i++) {
                ProductOrder order = orders[i];
                sum += order.price * order.quantity;
            }
            System.out.println("총 결제 금액 : " + sum);
        return sum;
        }
}
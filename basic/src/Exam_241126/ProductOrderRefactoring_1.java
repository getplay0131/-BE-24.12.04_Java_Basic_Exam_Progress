package Exam_241126;

public class ProductOrderRefactoring_1 {
    public static void main(String[] args) {
//        ProductOrder product [] = {};
//
//        for (int i = 1;; i++) {
//            product[i] = createProduct("두부",2000,2);
//            if (product[i].productName.isEmpty()) {
//                System.out.println("상품이 입력되지 않아 프로그램을 종료합니다.");
//                break;
//            }
//
//        }

        ProductOrder product1 = createProduct("두부",2000,2);

        ProductOrder product2 = createProduct("김치",5000,1);

        ProductOrder product3 = createProduct("콜라",1500,2);

        ProductOrder product4 = createProduct("아이스크림",1500,10);

        ProductOrder [] productList = {product1,product2,product3,product4};

    printOrders(productList);
    getTotalAmount(productList);

    }
//    static void addProduct(String productName, int price, int quantity ){
//        createProduct(productName,price,quantity);
//    }

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
            for (ProductOrder products : orders) {
                System.out.println("상품명 : " + products.productName + ", 가격 : " + products.price + ", 수량 : " + products.quantity);
            }
        }

        static int getTotalAmount(ProductOrder[] orders) {
            int sum = 0;
        for (ProductOrder order : orders) {
                sum += order.price * order.quantity;
            }
            System.out.println("총 결제 금액 : " + sum);
        return sum;
        }
}
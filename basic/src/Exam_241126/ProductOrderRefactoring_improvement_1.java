package Exam_241126;

public class ProductOrderRefactoring_improvement_1 {
        static int maxProducts = 10;
        static int productsCount = 0;
    public static void main(String[] args) {
        ProductOrder [] productList = new ProductOrder[maxProducts];
        addProduct(productList,"두부",2000,2);
        addProduct(productList,"김치",5000,1);
        addProduct(productList,"콜라",1500,2);
        addProduct(productList,"아이스크림",1500,10);
    printOrders(productList);
    getTotalAmount(productList);
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
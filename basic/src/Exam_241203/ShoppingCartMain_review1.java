package Exam_241203;

public class ShoppingCartMain_review1 {
    public static void main(String[] args) {
    ShoppingCart_review1 cart = new ShoppingCart_review1();

    Item_review1 item1 = new Item_review1("마늘",2000,2);
    Item_review1 item2 = new Item_review1("상추",3000,4);
    Item_review1 item3 = new Item_review1("고기",25000,2);

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);

    cart.displayItems();
    }
}
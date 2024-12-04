package Exam_241203;

public class ShoppingCart_review1 {
    private Item_review1 [] items = new Item_review1[10];
    private int itemCount;

    public void addItem(Item_review1 item1){
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item1;
        itemCount++;
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item_review1 item = items[i];
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item_review1 item = items[i];
        System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.calculatePrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

}
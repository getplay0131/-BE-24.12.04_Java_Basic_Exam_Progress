package Exam_241203;

public class Item_review1 {
private String name;
private int price;
private int productCount;

//값 받아서 초기화 
public Item_review1(String  name, int price, int productCount){
    this.name = name;
    this.price = price;
    this.productCount = productCount;
}

//출력시 해당 입력값의 상품명을 반환하기 위해 필요
public String getName(){
    return name;
}

//상품의 가격 반환하기 위해 필요
public int calculatePrice(){
    return price * productCount;
}

}
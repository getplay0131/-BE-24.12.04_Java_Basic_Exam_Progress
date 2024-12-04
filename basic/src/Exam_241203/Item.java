//요구사항
//접근 제어자를 사용해서 데이터를 캡슐화 하세요.
//해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다. 장바구니에는 상품을 최대 10개만 담을 수 있다.
//10개 초과 등록시: "장바구니가 가득 찼습니다." 출력

package Exam_241203;

public class Item {
//    필드 구역
    private String product;
    private int price;
    private int productCount;

//    초기화 생성자
    public Item(String product, int price, int productCount){
        this.product = product;
        this.price = price;
        this.productCount = productCount;
    }
//상품명 가져오기
    public String getName(){
        return product;
    }

//    합계 계산하기
    public int calculratePrice(){
        return price * productCount;
    }
}
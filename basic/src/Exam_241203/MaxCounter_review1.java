//이 클래스는 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공합니다.
//요구사항
//접근 제어자를 사용해서 데이터를 캡슐화 하세요.
//해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
package Exam_241203;

public class MaxCounter_review1 {
//    두 필드 모두 해당 클래스에서만 필요하므로 외부로부터 보호
private int count = 0;
private int max;


//외부에서 호출할 목적이라면 접근 제어자 지정 권장
public MaxCounter_review1(int max){
    this.max = max;
}

//값이 변경될 때 체크하는것 권장
public void increment(){
    if (count >= max){
        System.out.println("최대값을 초과할 수 없습니다.");
        return;
    }
    count++;
}

    public int getCount() {
        return count;
    }
}
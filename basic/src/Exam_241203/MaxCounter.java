//이 클래스는 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공

package Exam_241203;

public class MaxCounter {
  int count = 0;
  int max;

 MaxCounter(){

 }

 MaxCounter(int max){
     this.max = max;
 }

 public void increment(){
// 숫자 증가 메서드
     count++;
 }

 public int getCount(){
     if (count <= max) {
         System.out.println("현재값 : " + count);
         return count;
     } else {
         System.out.println("최대값을 초과할 수 없습니다.");
     }
     return max;
 }
}
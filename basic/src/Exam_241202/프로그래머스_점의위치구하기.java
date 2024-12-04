//사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
//
//x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
//x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
//x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
//x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
package Exam_241202;

public class 프로그래머스_점의위치구하기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] dot) {
        int num1 = Integer.parseInt(String.valueOf(dot[0]));
        int num2 = Integer.parseInt(String.valueOf(dot[1]));
        int answer = 0;
        if (num1 > 0 && num2 > 0) {
            answer = 1;
        } else if (num1 < 0 && num2 > 0) {
            answer = 2;
        } else if(num1 < 0 && num2 <0) {
        answer = 3;
        } else {
            answer = 4;
        }
                return answer;
            }
        }

    }
}
package Exam_2411282_241129;

public class antArmyCount_review1 {
//개미군단 사냥
//    체력이 매개변수로 주어짐
//    장군 = 5
//    병정 = 3
//    일개미 = 1
//    최소한으로 필요한 개미의 수

    class Solution {
        public int solution(int hp) {
//            hp = 23
//            answer = (23 / 5) + (23 % 5 / 3) + (((hp % 5) % 3) / 1);
//            answer = 4 + 1
            int answer = (hp / 5) + (hp % 5 / 3) + (((hp % 5) % 3) / 1);
            return answer;
        }
    }
}
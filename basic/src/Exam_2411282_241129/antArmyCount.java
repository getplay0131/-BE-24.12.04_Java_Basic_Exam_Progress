package Exam_2411282_241129;

public class antArmyCount {
//    개미 군단
//    주어진 매개변수에 딱 맞는 병력 == 최소한의 수
//    장군 = 5, 병정 = 3, 일 = 1

//    로직 구조 문제:
//
//for문의 조건 hp == 0은 hp가 0일 때만 실행되므로 실제로는 전혀 실행되지 않습니다
//count 값이 누적되지 않고 매번 새로 할당되고 있습니다
//조건문들이 중첩되어 있어 실제로 모든 케이스를 처리하지 못합니다
//
//
//계산 방식 개선:
//
//hp를 5로 나눈 몫: 장군개미 수
//남은 hp를 3으로 나눈 몫: 병정개미 수
//그래도 남은 hp: 일개미 수
//이런 순서로 접근하면 좋을 것 같습니다

//    while문이나 단순 나눗셈으로 접근
//큰 단위(5)부터 처리하고 나머지를 작은 단위로 넘기기
//count를 누적해서 더해가기
class Solution {
    public int solution(int hp) {
        int answer = 0;
//장군 개미 수
        int general = hp / 5;
        int generalRemain = hp % 5;

        int solider = generalRemain / 3;
        int soliderRemain = generalRemain % 3;

        answer = general + solider + soliderRemain;

        return answer;
    }
    }
}
//        public int solution(int hp) {
//            int warlord = 5;
//            int soldier = 3;
//            int ergate = 1;
//            int count = 0;
//
//            for (int i = 0; hp == 0; i++) {
//            if (count == hp / warlord) {
//                System.out.println(count);
//                if (hp % warlord >= 3) {
//                    count = hp / soldier;
//                    System.out.println(count);
//                    if(hp % soldier >= 2) {
//                        count = hp / ergate;
//                        System.out.println(count);
//                    }
//                }
//            }
//            }
//            return count;
//        }


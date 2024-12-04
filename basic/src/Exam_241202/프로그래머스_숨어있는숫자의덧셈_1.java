package Exam_241202;

public class 프로그래머스_숨어있는숫자의덧셈_1 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            for (int i = 0; i < my_string.length() ; i++) {
//                char 타입을 이용해 입력받는 문자열에서 해당 인덱스의 글자를 한글자만 가져온다.
            char num = my_string.charAt(i);
//            만약에 해당 값이 숫자일 경우
                if (num >= '0' && num <= '9') {
//                    결과 반환 변수에 해당 숫자로 변환후 더한다.
                    answer += num -'0';
                }
            }
            return answer;
        }
    }
}

//        public int solution(String my_string) {
//
//            int answer = 0;
//            for (int i = 0; i < my_string.length() ; i++) {
//                answer += Integer.parseInt(String.valueOf(my_string.matches("\\d+")));
//            }
//            return answer;
//        }

//class Solution {
//    public int solution(String myString) {
//        return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
//    }
//}
//문제 설명
//문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
package Exam_241202;

public class 프로그래머스_대문자와소문자 {
    class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < my_string.length() ; i++) {
                char c = my_string.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    answer.append ((char)(c -32));
                } else {
                    answer.append ((char)(c +32));
                }
            }
            return answer.toString();
        }
    }
}

//    class Solution {
//        public String solution(String my_string) {
//            String answer = "";
//            for (int i = 0; i < my_string.length(); i++) {
//                char checks = my_string.charAt(i);
//                if (checks >= 'a' && checks <= 'z'){
//                    answer += String.valueOf(checks).toUpperCase();
//                } else {
//                    answer += String.valueOf(checks).toLowerCase();
//            }
//        }
//            return answer;
//    }
//    }

// ================================================

//        public String solution(String my_string) {
/// /            String lower = String.valueOf(my_string.matches("^[a-z]*$"));
//            String lower = null;
//            String upper = String.valueOf(my_string.matches("^[A-Z]*$"));
//        for (int i = 0; i < my_string.length(); i++) {
//            lower = String.valueOf(my_string.matches("^[a-z]*$"));
//            if (my_string.matches("^[a-z]*$")) {
//
//            }
//                }
//            }
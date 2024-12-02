package Exam_241129;

public class pro_array2 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for (int i = 0; i <my_string.length() ; i++) {
                answer += String.valueOf(my_string.charAt(my_string.length()-1-i));
            }
            return answer;

        }
    }
}
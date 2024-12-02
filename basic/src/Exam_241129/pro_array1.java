package Exam_241129;

public class pro_array1 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for (int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
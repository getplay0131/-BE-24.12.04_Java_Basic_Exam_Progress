package Exam_2411282_241129;

public class rock_paper_scissors {
//    가위 = 2 / 보 = 5 / 바위 = 0
//    이기는거 바위 = 0 / 가위 = 2 / 보 = 5
    class Solution {
        public String solution(String rsp) {
            rsp = "502";
            String answer = "";
            for (int i = 0; i < rsp.length(); i++) {
                char current = rsp.charAt(i);
                if (current == '2') {
                    answer += "0";
                } else if (current == '5') {
                    answer += "2";
                } else if (current == '0') {
                    answer += "5";
                }
            }
            //            for (int i = 0; i <rsp.length() ; i++) {
//                if (rsp.charAt([i]). || rsp.contains("5") || rsp.contains("0")) {
//                    answer = rsp.replace("2","0");
//                    answer = rsp.replace("5","2");
//                    answer = rsp.replace("0","5");
//                }
//            }
            System.out.println(answer);
            return answer;
        }
    }
}
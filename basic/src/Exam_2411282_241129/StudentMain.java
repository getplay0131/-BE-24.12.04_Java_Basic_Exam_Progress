package Exam_2411282_241129;

public class StudentMain {
    public static void main(String[] args) {
    Student student1 = new Student("김철수",80);
        System.out.println(student1.name + "님 합격여부 : " + student1.isPass());
    }
}
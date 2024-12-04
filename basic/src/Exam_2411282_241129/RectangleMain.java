package Exam_2411282_241129;

public class RectangleMain {
    public static void main(String[] args) {

    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(5,3);
        System.out.println("넓이 : " + rectangle2.calculateArea());
        System.out.println("둘레 : " + rectangle2.calculatePerimeter());
    }
}
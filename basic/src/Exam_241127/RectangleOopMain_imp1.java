package Exam_241127;

public class RectangleOopMain_imp1 {
    public static void main(String[] args) {
    int width = 5;
    int height = 8;
    Rectangle_imp1 Rect = new Rectangle_imp1();

    int area = Rect.calculateArea(width, height);
    printMsg("넓이 : " + area);

    int perimeter = Rect.calculatePerimeter(width,height);
    printMsg("둘레 길이 : " + perimeter);

    boolean square = Rect.isSquare(width, height);
        if (width == height) {
            printMsg("정사각형 입니다.");
            printMsg(" === 프로그램 종료 ===");
        } else {
            printMsg("정사각형이 아닙니다.");
            printMsg(" === 프로그램 종료 ===");
        }
    }

    static void printMsg(String msg) {
        System.out.println(msg);
    }

}
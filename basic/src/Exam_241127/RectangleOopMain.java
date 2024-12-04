package Exam_241127;

public class RectangleOopMain {
    public static void main(String[] args) {
    int width = 5;
    int height = 8;
    Rectangle Rect = new Rectangle();

    Rect.area = Rect.calculateArea(width, height);

    Rect.perimeter = Rect.calculatePerimeter(width, height);

    Rect.square = Rect.isSquare(width, height);
    }
}
package Exam_241127;

public class Rectangle {
boolean square;
int area;
int perimeter;

int calculateArea(int a, int b) {
    area = a * b;
    System.out.println("넓이 : " + area);
    return area;
}

    int calculatePerimeter(int a, int b) {
    perimeter = (a + b) * 2;
    System.out.println("둘레 길이 : " + perimeter);
        return perimeter;
}

boolean isSquare(int a, int b) {
    if (a == b) {
        System.out.println("정사각형 입니다.");
    } else {
        System.out.println("정사각형이 아닙니다.");
    }
    return a == b;
}
}
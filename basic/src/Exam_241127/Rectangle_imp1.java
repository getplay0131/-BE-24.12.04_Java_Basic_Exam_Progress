package Exam_241127;

public class Rectangle_imp1 {
int width;
int height;

int calculateArea(int width, int height) {
    return width * height;
}

    int calculatePerimeter(int width, int height) {
    return (width + height) * 2;
}

boolean isSquare(int width, int height) {
    return width == height;
}
}
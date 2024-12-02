package Exam_2411282_241129;

public class Rectangle {
int width;
int height;

Rectangle(){

}

Rectangle(int width, int height){
this.width = width;
this.height = height;
}

int calculateArea(){
    return width * height ;
}

int calculatePerimeter() {
    return (width + height) * 2 ;
}
}
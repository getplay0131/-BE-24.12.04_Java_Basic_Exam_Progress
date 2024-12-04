package Exam_2411282_241129;

public class Product {
String name;
int price;

Product(String name, int price){
    this.name = name;
    this.price = price;
}

String getInfo(){
    return ("상품명 : " + name + ", 가격 : " + price);
}
}
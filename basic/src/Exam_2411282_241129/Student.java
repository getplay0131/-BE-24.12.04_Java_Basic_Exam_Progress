package Exam_2411282_241129;

public class Student {
String name;
int score;

Student(){

}

Student(String name) {
    this(name,0);
}

Student(String name, int score){
    this.name = name;
    this.score = score;
}

boolean isPass() {
    if (score >= 60) {
        return true;
    }
    return false;
}

}
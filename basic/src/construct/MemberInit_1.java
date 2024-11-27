package construct;

public class MemberInit_1 {
String name;
int age;
int grade;

// if (매개 변수명 == 멤버 변수명){
//    this 사용하여 자기 자신 지정;
//    } else {
//    this 사용 필요 없음;
//    }
void initMember(String inputName, int inputAge, int inputGrade) {
    name = inputName;
    age = inputAge;
    grade = inputGrade;
//    this.name = name;
//    this.age = age;
//    this.grade = grade;
}
}
package construct;

public class MemberConstruct3 {
    String name;
    int age;
    int grade;

//    두 생성자 모두 비슷한 기능을 하며, 첫번째 생성자의 코드처럼 구성이 불가한 이유는 무한 재귀 호출(무한히 자기 자신 호출)을 방지하기 위해서이다.
    MemberConstruct3(String name, int age){
        this(name,age,50);
    }

    MemberConstruct3(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
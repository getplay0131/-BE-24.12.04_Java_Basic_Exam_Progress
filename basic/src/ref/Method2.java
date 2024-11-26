package ref;

public class Method2 {
    public static void main(String[] args) {
    Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);

    Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);


        printStudent(student1);
        printStudent(student2);

    }


    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);
        initStudent(student, name, age, grade);
        return student;
    }

    static void initStudent (Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
}

    static void printStudent (Student student) {
    System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
}
}

//2번 코드가 더 좋은 코드입니다. 그 이유를 설명드리면:
//
//1. **단일 책임 원칙(Single Responsibility Principle)**
//```java
/// / 1번 코드의 createStudent
//static Student createStudent(String name, int age, int grade) {
//    Student student = new Student();
//    student.name = name;      // 객체 생성과 초기화가
//    student.age = age;        // 한 메서드에서
//    student.grade = grade;    // 모두 처리됨
//    return student;
//}
//
//// 2번 코드
//static Student createStudent(...) {  // 객체 생성 담당
//    Student student = new Student();
//    initStudent(student, name, age, grade);
//    return student;
//}
//
//static void initStudent(...) {  // 객체 초기화 담당
//    student.name = name;
//    student.age = age;
//    student.grade = grade;
//}
//```
//
//2. **재사용성과 유연성**
//```java
//// 2번 코드의 장점
//// 1. 기존 Student 객체 재초기화 가능
//Student existingStudent = new Student();
//initStudent(existingStudent, "새이름", 17, 85);
//
//// 2. 초기화 로직 변경시 한 곳만 수정하면 됨
//static void initStudent(...) {
//    // 여기만 수정하면 됨
//    student.name = name;
//    // 검증 로직 추가 가능
//    if (age < 0) throw new IllegalArgumentException("나이는 음수일 수 없습니다");
//    student.age = age;
//    student.grade = grade;
//}
//```
//
//3. **유지보수성**
//- 객체 생성과 초기화가 분리되어 있어 각각의 로직을 수정하기 쉬움
//- 초기화 관련 버그가 발생했을 때 initStudent 메서드만 확인하면 됨
//- 나중에 초기화 방식이 바뀌어도 createStudent는 수정할 필요 없음
//
//4. **테스트 용이성**
//```java
//// 2번 코드는 초기화 로직만 따로 테스트 가능
//@Test
//void testInitStudent() {
//    Student student = new Student();
//    initStudent(student, "test", 20, 100);
//    // 초기화 결과만 검증하면 됨
//}
//```
//
//5. **확장성**
//```java
//// 나중에 다른 종류의 초기화가 필요할 때
//static void initStudentWithDefaults(Student student) {
//    initStudent(student, "미정", 0, 0);
//}
//
//static void initStudentFromDatabase(Student student, DatabaseRecord record) {
//    initStudent(student, record.getName(), record.getAge(), record.getGrade());
//}
//```
//
//따라서 2번 코드가:
//- 더 명확한 책임 분리
//- 더 높은 재사용성
//- 더 좋은 유지보수성
//- 더 쉬운 테스트
//- 더 좋은 확장성
//을 제공하므로 더 좋은 코드라고 할 수 있습니다.
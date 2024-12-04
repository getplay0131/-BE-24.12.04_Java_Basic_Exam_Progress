package construct;

public class MethodInitMain1_1 {
    public static void main(String[] args) {
    MemberInit_1 member1 = new MemberInit_1();
        member1.initMember("user1",15,90);


        MemberInit_1 member2 = new MemberInit_1();
        member2.initMember("user2",17,55);



        MemberInit_1[] members = {member1, member2 };

        for (MemberInit_1 s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }

    static MemberInit initMember(MemberInit member, String  name, int age, int grade) {
        MemberInit members = new MemberInit();
        members.name = name;
        members.age = age;
        members.grade = grade;
        return members;
    }
}
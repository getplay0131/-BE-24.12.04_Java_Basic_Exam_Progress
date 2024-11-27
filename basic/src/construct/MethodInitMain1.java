package construct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
        member1 = initMember(member1, "user1", 15, 90 );
//        member1.name = "user1";
//        member1.age = 15;
//        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2 = initMember(member2, "user2", 16, 80 );

//        member2.name = "user2";
//        member2.age = 17;
//        member2.grade = 55;

        MemberInit[] members = {member1, member2 };

        for (MemberInit s : members) {
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
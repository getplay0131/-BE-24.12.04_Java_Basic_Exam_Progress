package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
//        성적 입력이 필요 없다면 첫번째의 메서드를 사용하면 된다.
    MemberConstruct2 member1 = new MemberConstruct2("user1", 15);
    MemberConstruct2 member2 = new MemberConstruct2("user2", 17, 55);

        MemberConstruct2[] members = {member1, member2};
        for (MemberConstruct2 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
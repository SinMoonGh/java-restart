package variable;

public class Member_main {
    public static void main(String[] args) {
        // 객체 생성
        MemberInit member1 = new MemberInit();
        Memberinit(member1, 12, "나나코", "어딘가 살겠지");
        System.out.println(member1.house);



        MemberInit member2 = new MemberInit();
        Memberinit(member2, 12, "나나", "딘가 살겠지");
        System.out.println(member2.house);
    }

    static void Memberinit(MemberInit member, int age, String name, String house){
        member.age = age;
        member.name = name;
        member.house = house;
    }
}

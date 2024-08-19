package variable;

public class ThisMember {
    public static void main(String[] args) {
        // 객체 생성
//        MemberInit member1 = new MemberInit();
//        member1.AnotherMemberInit(12, "나나키", "존버");
//        System.out.println(member1.age + ", " + member1.name);



        MemberCreater member2 = new MemberCreater(12, "나나키", "존버");
        System.out.println(member2.age + ", " + member2.name);

        DefaultCreator member3 = new DefaultCreator();
        System.out.println(member3.age + ", " + member3.name);


        MemberCreater member4 = new MemberCreater(12, "노무");
        System.out.println(member4.age + ", " + member4.name + ", " + member4.house);
    }
}

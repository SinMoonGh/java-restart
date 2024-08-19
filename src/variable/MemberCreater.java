package variable;

public class MemberCreater {
    int age;
    String name;
    String house;

    MemberCreater(int age, String name, String house){
        this.age = age;
        this.name= name;
        this.house = house;
    }

    MemberCreater(int age, String name){
        this(age, name, "다가구 주택");
    }
}

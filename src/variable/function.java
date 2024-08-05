package variable;

public class function {
    public static void main(String[] args) {
        int peter_age = 26;

        door(peter_age);
    }

    public static void door(int age) {
        if (age < 18) {
            System.out.println("18살 미만입니다.");
        } else {
            System.out.println("18이상입니다.");
        }
    }
}

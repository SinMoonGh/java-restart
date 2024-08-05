package variable;

public class method1 {
    public static void main(String[] args) {
        System.out.println(avg(1, 2, 3));
        System.out.println(avg(15, 25, 35));

    }

    public static double avg(int x, int y, int z) {
        // Java에는 pass 기능이 없으므로, 임시로 0을 반환하도록 합니다.
        int sum = x + y + z;
        double average = sum / 3;
        return average;
    }
}

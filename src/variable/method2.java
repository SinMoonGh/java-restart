package variable;

public class method2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        repeat_message(3, message);
    }

    public static void repeat_message(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}

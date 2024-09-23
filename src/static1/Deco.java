package static1;


public class Deco {
    // 함수 호출하면 문자열 앞 뒤에 *을 달아준다.
    public static String addStars(String message) {
        String deco_message = "*" + message + "*";
        return deco_message;
    }
}
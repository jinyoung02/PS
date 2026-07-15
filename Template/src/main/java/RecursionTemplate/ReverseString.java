package RecursionTemplate;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";

        String result = reverseString(s);

        System.out.println(result);
    }

    // 문자열 뒤집기
    static String reverseString(String s) {
        if(s.length() <= 1) {
            return s;
        }

        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
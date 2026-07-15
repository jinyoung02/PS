package RecursionTemplate;

public class Palindrome {
    public static void main(String[] args) {
        String s = "level";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }

    // 회문인지 확인하기
    static boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
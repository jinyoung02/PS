package RecursionTemplate;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        int result = factorial(n);

        System.out.println(result);
    }

    // 팩토리얼: n부터 1까지 곱하기
    static int factorial(int n) {
        if(n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
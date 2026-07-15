package RecursionTemplate;

public class SumNumbers {
    public static void main(String[] args) {
        int n = 5;

        int result = sumNumbers(n);

        System.out.println(result);
    }

    // 1부터 n까지 더하기
    static int sumNumbers(int n) {
        if(n == 1) {
            return 1;
        }

        return n + sumNumbers(n - 1);
    }
}
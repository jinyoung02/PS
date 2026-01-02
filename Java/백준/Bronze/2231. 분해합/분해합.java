import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int start = Math.max(0, N - 63);
        int answer = 0;

        for (int i = start; i < N; i++) {
            int sum = i;
            int x = i;

            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }

            if (sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            int n = a[i];

            if (n <= 1)
                continue;

            boolean isPrime = true;

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                count++;
        }

        System.out.println(count);
    }
}

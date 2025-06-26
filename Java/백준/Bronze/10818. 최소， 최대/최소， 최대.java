import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int k[] = new int[N];
        for (int i = 0; i < N; i++) {
            k[i] = sc.nextInt();
        }
        int max = k[0];
        for (int i = 1; i < N; i++) {
            if (max < k[i]) {
                max = k[i];
            }
        }
        int min = k[0];
        for (int i = 1; i < N; i++) {
            if (min > k[i]) {
                min = k[i];
            }
        }
        System.out.println(min + " " + max);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int j = 0; j < T; j++) {
            int k = input.nextInt();
            int n = input.nextInt();

            int[][] people = new int[k + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                people[0][i] = i;
            }

            for (int i = 1; i <= k; i++) {
                for (int m = 1; m <= n; m++) {
                    people[i][m] = people[i][m - 1] + people[i - 1][m];
                }
            }

            System.out.println(people[k][n]);
        }
    }
}

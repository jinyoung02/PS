import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String in = sc.next();
            int sum = 0;
            int score = 0;

            for (int j = 0; j < in.length(); j++) {
                if (in.charAt(j) == 'O') {
                    sum += 1;
                    score += sum;
                } else {
                    sum = 0;
                }
            }
            System.out.println(score);
        }
    }
}

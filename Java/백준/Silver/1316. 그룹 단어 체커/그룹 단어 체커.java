import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = input.next();
            boolean isGroup = true;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    if (s.indexOf(s.charAt(j)) < j - 1) {
                        isGroup = false;
                        break;
                    }
                }
            }
            if (isGroup) {
                count++;
            }
        }
        System.out.println(count);
    }
}
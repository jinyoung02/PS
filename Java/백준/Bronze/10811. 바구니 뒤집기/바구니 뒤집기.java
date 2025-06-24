import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        // 바구니 수 N, 작업 수 M 입력
        int N = k.nextInt();
        int M = k.nextInt();

        int[] baskets = new int[N];
        
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            int i = k.nextInt();
            int j = k.nextInt();

            int left = i - 1;
            int right = j - 1;

            while (left < right) {
                int temp = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = temp;
                left++;
                right--;
            }
        }

        for (int num : baskets) {
            System.out.print(num + " ");
        }

        k.close();
    }
}

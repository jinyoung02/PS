import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 42;

        int[] k = new int[10];
        int[] p = new int[10];

        for(int i = 0; i < 10; i++){
            k[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            p[i] = k[i]%a;
        }

        Arrays.sort(p);

        int point = 1;
        for(int i = 0; i < 9; i++){
            if(p[i] != p[i+1]){
                point++;
            }
        }
        System.out.println(point);
    }
}

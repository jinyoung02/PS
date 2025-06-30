import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int cnt1 = 0;
		int cnt2 = 0;
		int arr[] = new int[8];
		
		for(int i = 0; i < arr.length; i++) {
			a = sc.nextInt();
			arr[i] = a;
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]-1)
				cnt1++;
			else if(arr[i] == arr[i+1]+1)
				cnt2++;
		}
		
		if(cnt1 == 7)
			System.out.println("ascending");
		else if(cnt2 == 7)
			System.out.println("descending");
		else 
			System.out.println("mixed");
	}
}
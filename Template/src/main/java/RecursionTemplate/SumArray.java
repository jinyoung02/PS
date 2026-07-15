package RecursionTemplate;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = sumArray(arr, 0);

        System.out.println(result);
    }

    // idx부터 마지막까지 배열 값 더하기
    static int sumArray(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }

        return arr[idx] + sumArray(arr, idx + 1);
    }
}
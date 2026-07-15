package RecursionTemplate;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;

        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println(result);
    }

    // 정렬된 배열에서 target의 인덱스 찾기
    static int binarySearch(int[] arr, int target, int low, int high) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        }
        else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }
}
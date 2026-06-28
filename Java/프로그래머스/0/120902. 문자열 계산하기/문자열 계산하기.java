class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");

        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i = i + 2) {
            int num = Integer.parseInt(arr[i + 1]);

            if (arr[i].equals("+")) {
                answer = answer + num;
            } else {
                answer = answer - num;
            }
        }

        return answer;
    }
}
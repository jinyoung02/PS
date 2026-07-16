class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        int[] stack = new int[ingredient.length];
        int index = 0; // 현재 쌓인 개수

        for(int i=0; i<ingredient.length; i++) {
            stack[index] = ingredient[i];
            index = index + 1;

            if(index >= 4) {
                if(stack[index-4] == 1 &&
                   stack[index-3] == 2 &&
                   stack[index-2] == 3 &&
                   stack[index-1] == 1) {

                    answer = answer + 1;
                    index = index - 4;
                }
            }
        }

        return answer;
    }
}
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 잠깐 값을 넣어볼 공간 k+1
        int[] list = new int[k+1];
        int count = 0;
        
        for(int i=0; i<score.length; i++) {
            list[count] = score[i];
            count = count+1;
            
            for(int a=0; a<count; a++) {
                for(int b=a+1; b<count ; b++) {
                    if(list[a] > list[b]) {
                        int temp = list[a];
                        list[a] = list[b];
                        list[b] = temp;
                    }
                }
            }
            if(count > k) {
                for(int a=0; a<count-1; a++) {
                    list[a] = list[a+1];
                }
                count = count - 1;
            }
            answer[i] = list[0];
        }
        return answer;
    }
}
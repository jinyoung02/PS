class Solution {
    public int[] solution(int[] numbers) {
        int[] p=new int[201];

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                p[sum]=1;
            }
        }

        int count = 0;

        for(int i=0; i<p.length; i++) {
            if(p[i]==1) {
                count = count+1;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        for(int i=0; i<p.length; i++) {
            if(p[i]==1) {
                answer[index]=i;
                index=index+1;
            }
        }

        return answer;
    }
}
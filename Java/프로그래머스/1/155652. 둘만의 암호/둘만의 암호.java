class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            int count = 0;
            
            while(count < index) {
                c = (char)(c+1);
                
                if(c > 'z') {
                    c ='a';
                }
                
                if(skip.indexOf(c) == -1) {
                    count += 1;
                }
            }
            
            answer += c;
        }
        
        return answer;
    }
}
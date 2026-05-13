import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++) {
            if(!deque.contains(s.charAt(i))) {
                answer[i] = -1;
            } else {
                int idx = 1;
                for(int j=i-1; j>=0; j--) {
                    if(s.charAt(j) == s.charAt(i)) {
                        answer[i] = idx;
                        break;
                    }
                    idx++;
                }   
            }
            
            deque.offer(s.charAt(i));
        }
        
        return answer;
    }
}
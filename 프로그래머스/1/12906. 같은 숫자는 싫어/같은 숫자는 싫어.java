import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i : arr) {
            if(deque.isEmpty()) {
                deque.offer(i);
            } else {
                if(i == deque.peekLast()) continue;
                deque.offer(i);
            }
        }
        
        int[] answer = new int[deque.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = deque.poll();
        }
        
        return answer;
    }
}
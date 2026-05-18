import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        int date = 0;
        
        for(int i=0; i<progresses.length; i++) {
            date = 0;
            date = (100-progresses[i]) / speeds[i];
            if((100-progresses[i]) % speeds[i] != 0) date++;
            
            deque.offer(date);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!deque.isEmpty()) {
            int cur = deque.poll();
            int idx = 1;
            
            while(!deque.isEmpty() && deque.peek() <= cur) {
                deque.poll();
                idx++;
            }
            
            list.add(idx);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
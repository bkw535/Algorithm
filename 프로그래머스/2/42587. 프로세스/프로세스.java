import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> deque = new ArrayDeque<>();
        
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<priorities.length; i++) {
            deque.add(new int[]{priorities[i], i});
            pqueue.add(priorities[i]);
        }
        
        int answer = 0;
        
        while(!deque.isEmpty()) {
            int[] current = deque.poll();
            
            if(current[0] == pqueue.peek()) {
                answer++;
                pqueue.poll();
                
                if(current[1] == location) {
                    return answer;
                }
            } else {
                deque.add(current);
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i : people) {
            deque.offer(i);
        }
        
        while(!deque.isEmpty()) {
            int cur = deque.pollLast();
            int check = 0;
            
            if(!deque.isEmpty()) {
                check = deque.pollFirst();
            }
            
            if(cur+check > limit) deque.offerFirst(check);
            
            boat++;
        }
        
        return boat;
    }
}
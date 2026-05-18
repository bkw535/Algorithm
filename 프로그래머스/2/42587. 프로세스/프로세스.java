import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> deque = new ArrayDeque<>();
        
        for(int i=0; i<priorities.length; i++) {
            deque.offer(new int[]{i, priorities[i]});
        }
        
        int idx = 0;
        while(!deque.isEmpty()) {
            int[] arr = deque.poll();
            boolean tf = false;
            for(int[] i : deque) {
                if(i[1] > arr[1]) {
                    tf = true;
                    break;
                }
            }
            
            if(tf) {
                deque.offer(new int[]{arr[0], arr[1]});
            } else {
                idx++;
                if(arr[0] == location) {
                    return idx;
                }
            }
        }
        
        return idx;
    }
}
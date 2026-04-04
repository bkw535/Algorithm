import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] complete = new int[progresses.length];
        for(int i=0; i<progresses.length; i++) {
            int c = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i] != 0) c++;
            complete[i] = c;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int cur = complete[0];
        int count = 1;
        
        for(int i=1; i<complete.length; i++) {
            if(cur >= complete[i]) count++;
            else {
                list.add(count);
                cur = complete[i];
                count = 1;
            }
        }
        
        list.add(count);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
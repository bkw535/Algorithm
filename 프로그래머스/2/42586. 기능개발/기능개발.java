import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] count = new int[speeds.length];
        
        for(int i=0; i<speeds.length; i++) {
            count[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) count[i] += 1;
        }
        
        int cur = count[0];
        int num = 1;
        for(int i=1; i<count.length; i++) {
            if(cur >= count[i]) num++;
            else {
                answer.add(num);
                cur = count[i];
                num = 1;
            }
        }
        answer.add(num);
        
        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
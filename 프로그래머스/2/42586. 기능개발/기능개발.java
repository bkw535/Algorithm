import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[speeds.length];
        
        for(int i=0; i<speeds.length; i++) {
            int remain = 100 - progresses[i];
            
            if(remain % speeds[i] != 0) {
                arr[i] = remain / speeds[i] + 1;
            } else {
                arr[i] = remain / speeds[i];
            }
        }
        
        List<Integer> result = new ArrayList<>();
        int days = 0;
        days = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                result.add(count);
                count = 1;
                days = arr[i];
            }
        }
        result.add(count);
        
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
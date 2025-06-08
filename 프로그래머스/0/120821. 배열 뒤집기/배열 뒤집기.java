import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : num_list) {
            list.add(num);
        }
        
        Collections.reverse(list);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
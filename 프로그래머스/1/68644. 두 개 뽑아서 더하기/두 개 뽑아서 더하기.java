import java.util.*;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            int a = numbers[i];
            sum(i, a, numbers);
        }
        
        Collections.sort(list);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
    
    public void sum(int m, int n, int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            if(i == m) continue;
            int b = n + numbers[i];
            if(list.contains(b)) continue;
            list.add(b);
        }
    } 
}
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] arr = new int[s.length()];
        int[] answer = new int[s.length()];
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(set.contains(a)) {
                for(int j=i-1; j>=0; j--) {
                    if(s.charAt(j) == a) {
                        answer[i] = i-j;
                        break;
                    }
                }
            } else {
                set.add(a);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
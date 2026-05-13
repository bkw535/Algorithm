import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        
        for(int j=0; j<strings.length-1; j++) {
            for(int i=0; i<strings.length-1; i++) {
                char a = strings[i].charAt(n);
                char b = strings[i+1].charAt(n);
            
                if(a > b) {
                    String tmp = "";
                    tmp = strings[i];
                    strings[i] = strings[i+1];
                    strings[i+1] = tmp;
                }   
            }
        }
        
        return strings;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] pattern = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        int[] scores = new int[3];
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<answers.length; j++) {
                if(answers[j] == pattern[i][j % pattern[i].length]) {
                    scores[i]++;
                }
            }
        }
        
        int max = Math.max(Math.max(scores[0],scores[1]), scores[2]);
        
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<3; i++) {
            if(scores[i] == max) {
                result.add(i+1);
            }
        }
        
        return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}
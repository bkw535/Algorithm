import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] tester = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        
        for(int i=0; i<answers.length; i++) {
            if (answers[i] == tester[0][i % 5]) test1++;
            if (answers[i] == tester[1][i % 8]) test2++;
            if (answers[i] == tester[2][i % 10]) test3++;
        }
        
        int max = Math.max(test1, Math.max(test2, test3));
        
        List<Integer> list = new ArrayList<>();
        if(max == test1) list.add(1);
        if(max == test2) list.add(2);
        if(max == test3) list.add(3);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
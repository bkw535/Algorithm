import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[][] rate = new double[N][2];
        
        for(int i=1; i<N+1; i++){
            int index = 0;
            int clear = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]==i) index++;
                if(stages[j]>=i) clear++;
            }
            rate[i-1][0] = i;
            rate[i - 1][1] = (clear == 0) ? 0 : (double) index / clear;
        }
        
        Arrays.sort(rate, (a, b) -> {
            if (Double.compare(b[1], a[1]) == 0) {
                return Double.compare(a[0], b[0]);
            }
            return Double.compare(b[1], a[1]);
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) rate[i][0];
        }
        
        return answer;
    }
}
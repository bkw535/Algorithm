import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] answer = new double[N];
        
        int index = stages.length;
        
        for(int j=1; j<=N; j++) {
            int count = 0;
            for(int i : stages) {
                if(i == j) count++;
            }
            
            if(index == 0) {
                answer[j-1] = 0;
            } else {
                answer[j-1] = (double) count/index;
            }
            
            index -=count;
        }
        
        return IntStream.range(0, N)
                .boxed()
                .sorted((a, b) -> {
                    if (Double.compare(answer[b], answer[a]) != 0) {
                        return Double.compare(answer[b], answer[a]);
                    }
                    return Integer.compare(a, b);
                })
                .mapToInt(i -> i + 1)
                .toArray();
    }
}
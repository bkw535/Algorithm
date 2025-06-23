import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i==0)
                list.add(arr[i]);
            if (arr[i] != list.get(list.size() - 1))
                list.add(arr[i]);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
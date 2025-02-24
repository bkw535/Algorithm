import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(i==j)
                    continue;
                else
                    s.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = s
            .stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
        return answer;
    }
}
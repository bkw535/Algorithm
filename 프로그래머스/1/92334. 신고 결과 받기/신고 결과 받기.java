import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++) {
            map.put(id_list[i], 0);
        }
        
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, List<String>> reportMap = new HashMap<>();
        for(String s : set) {
            String[] re = s.split(" ");
            String reporter = re[0];
            String target = re[1];
            
            map.put(target, map.getOrDefault(target, 0) + 1);
            
            reportMap.putIfAbsent(reporter, new ArrayList<>());
            reportMap.get(reporter).add(target);
        }
        
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++) {
            String user = id_list[i];
            if(!reportMap.containsKey(user)) continue;
            
            for(String target : reportMap.get(user)) {
                if(map.get(target) >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
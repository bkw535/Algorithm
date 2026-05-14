import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 전체 인원
        Map<String, Integer> person = new HashMap<>();
        for(int i=0; i<id_list.length; i++) {
            person.put(id_list[i], 0);
        }
        
        // 신고 기록
        Map<String, Set<String>> result = new HashMap<>();
        for(int i=0; i<report.length; i++) {
            StringTokenizer st = new StringTokenizer(report[i]);
            String a = st.nextToken();
            String b = st.nextToken();
            
            if(!result.containsKey(a)) {
                result.put(a, new HashSet<>());
            }
            
            result.get(a).add(b);
        }
        
        // 신고 횟수
        for(int i=0; i<id_list.length; i++) {
            String name = id_list[i];
            if(!result.containsKey(name)) continue;
            for(String s : result.get(name)) {
                person.put(s, person.get(s) + 1);   
            }
        }
        
        // 결과 비교
        Map<String, Integer> mail = new HashMap<>();
        for(String s : result.keySet()) {
            Set<String> set = result.get(s);
            for(String target : set) {
                if(person.get(target) >= k) {
                    mail.put(s, mail.getOrDefault(s, 0) + 1);
                }
            }
        }
        
        // 결과 저장
        int[] count = new int[id_list.length];
        for(int i=0; i<id_list.length; i++) {
            count[i] = mail.getOrDefault(id_list[i], 0);
        }
        
        return count;
    }
}
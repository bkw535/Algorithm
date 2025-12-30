import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();

        Map<String, Integer> mailCount = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            mailCount.put(id, 0);
        }

        for (String r : report) {
            String[] p = r.split(" ");
            String from = p[0];
            String to = p[1];

            reportMap.get(to).add(from);
        }

        for (String banned : reportMap.keySet()) {
            if (reportMap.get(banned).size() >= k) {
                for (String reporter : reportMap.get(banned)) {
                    mailCount.put(
                        reporter,
                        mailCount.get(reporter) + 1
                    );
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }

        return answer;
    }
}
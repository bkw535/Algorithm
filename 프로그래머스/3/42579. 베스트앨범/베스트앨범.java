import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        
        Map<String, List<int[]>> songs = new HashMap<>();
        
        for(int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            
            if(!songs.containsKey(genres[i])) {
                songs.put(genres[i], new ArrayList<>());
            }
            
            songs.get(genres[i]).add(new int[] {i, plays[i]});
        }
        
        List<String> genreList = new ArrayList<>(map.keySet());
        
        genreList.sort((a, b) -> {
            return map.get(b) - map.get(a);
        });
        
        List<Integer> answer = new ArrayList<>();
        
        for(String s : genreList) {
            List<int[]> list = songs.get(s);
            
            list.sort((a, b) -> {
                if(a[1] == b[1]) return a[0]-b[0];
                
                return b[1]-a[1];
            });
            
            for(int i=0; i<Math.min(2, list.size()); i++) {
                answer.add(list.get(i)[0]);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for(int i=0; i<answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
        
    }
}
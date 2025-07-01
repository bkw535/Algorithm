import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> mostGenres = new HashMap<>();
        HashMap<String, List<int[]>> mostPlays = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            mostGenres.put(genre, mostGenres.getOrDefault(genre, 0) + play);

            List<int[]> list = mostPlays.getOrDefault(genre, new ArrayList<>());
            list.add(new int[]{play, i});
            mostPlays.put(genre, list);
        }

        List<String> genreOrder = new ArrayList<>(mostGenres.keySet());
        genreOrder.sort((a, b) -> mostGenres.get(b) - mostGenres.get(a));

        List<Integer> result = new ArrayList<>();

        for (String genre : genreOrder) {
            List<int[]> songs = mostPlays.get(genre);

            songs.sort((a, b) -> {
                if (b[0] == a[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            });

            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i)[1]);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
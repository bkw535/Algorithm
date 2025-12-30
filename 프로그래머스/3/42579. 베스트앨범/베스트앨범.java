import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();

        Map<String, List<int[]>> songsByGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreTotal.put(genres[i],
                    genreTotal.getOrDefault(genres[i], 0) + plays[i]);

            songsByGenre
                .computeIfAbsent(genres[i], k -> new ArrayList<>())
                .add(new int[]{i, plays[i]});
        }

        List<String> genreOrder = new ArrayList<>(genreTotal.keySet());
        genreOrder.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));

        List<Integer> result = new ArrayList<>();

        for (String genre : genreOrder) {
            List<int[]> songs = songsByGenre.get(genre);

            songs.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1];
                return a[0] - b[0];
            });

            result.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                result.add(songs.get(1)[0]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
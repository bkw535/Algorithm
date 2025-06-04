import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> route = new HashSet<>();
        int x = 5, y = 5;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        String[] dirStr = {"U", "D", "L", "R"};

        for (int i = 0; i < dirs.length(); i++) {
            String d = dirs.charAt(i) + "";
            int dirIdx = Arrays.asList(dirStr).indexOf(d);
            int nx = x + dx[dirIdx];
            int ny = y + dy[dirIdx];

            if (nx < 0 || ny < 0 || nx > 10 || ny > 10) continue;

            String path = x + "," + y + "-" + nx + "," + ny;
            String reverse = nx + "," + ny + "-" + x + "," + y;
            route.add(path);
            route.add(reverse);

            x = nx;
            y = ny;
        }

        return route.size() / 2;
    }
}
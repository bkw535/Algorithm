import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {

        int[] prev = new int[n];
        int[] next = new int[n];
        boolean[] deleted = new boolean[n];

        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        next[n - 1] = -1;

        Stack<Integer> stack = new Stack<>();

        int cur = k;

        for (String c : cmd) {
            char type = c.charAt(0);

            if (type == 'U') {
                int x = Integer.parseInt(c.substring(2));
                while (x-- > 0) {
                    cur = prev[cur];
                }

            } else if (type == 'D') {
                int x = Integer.parseInt(c.substring(2));
                while (x-- > 0) {
                    cur = next[cur];
                }

            } else if (type == 'C') {
                stack.push(cur);
                deleted[cur] = true;

                if (prev[cur] != -1) {
                    next[prev[cur]] = next[cur];
                }
                if (next[cur] != -1) {
                    prev[next[cur]] = prev[cur];
                }

                if (next[cur] != -1) {
                    cur = next[cur];
                } else {
                    cur = prev[cur];
                }

            } else if (type == 'Z') {
                int r = stack.pop();
                deleted[r] = false;

                if (prev[r] != -1) {
                    next[prev[r]] = r;
                }
                if (next[r] != -1) {
                    prev[next[r]] = r;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (boolean d : deleted) {
            sb.append(d ? 'X' : 'O');
        }

        return sb.toString();
    }
}
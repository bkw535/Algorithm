import java.io.*;
import java.util.*;

public class Main {
    static void toggle(int[] arr, int idx) {
        arr[idx] = (arr[idx] == 0) ? 1 : 0;
    }

    static void male(int[] arr, int n, int k) {
        for (int i = k; i <= n; i += k) {
            toggle(arr, i);
        }
    }

    static void female(int[] arr, int n, int k) {
        toggle(arr, k);
        int left = k - 1;
        int right = k + 1;

        while (left >= 1 && right <= n && arr[left] == arr[right]) {
            toggle(arr, left);
            toggle(arr, right);
            left--;
            right++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                male(num, n, k);
            } else {
                female(num, n, k);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(num[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}
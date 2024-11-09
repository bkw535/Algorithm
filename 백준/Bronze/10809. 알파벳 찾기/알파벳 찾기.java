import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[] b = new int[26];

        for (int i = 0; i < 26; i++) {
            b[i] = -1;
        }

        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);  // 문자열에서 i번째 문자를 가져옴
            int index = ch - 'a';  // 'a'부터의 상대적인 인덱스를 구함
            if (b[index] == -1) {  // 해당 문자가 처음 등장했을 때만
                b[index] = i;      // 현재 인덱스를 저장
            }
        }

        for(int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
    }
}

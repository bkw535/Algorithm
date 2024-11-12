import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());  // 첫 번째 줄에 숫자 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());  // 두 번째 줄에 숫자 입력

        int count = 0;

        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < 2) continue;  // 2보다 작은 수는 소수가 아님
            
            boolean isPrime = true;  // 소수 판별 변수
            for (int j = 2; j * j <= num; j++) {  // 소수 판별 루프
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;  // 소수일 때만 count 증가
        }
        
        System.out.println(count);
    }
}
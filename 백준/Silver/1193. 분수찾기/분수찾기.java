import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int line = 0;     // 대각선 마지막 번호
        int index = 1;    // 대각선 길이
        
        while(true) {
            if(line < X) {
                line+=index;
                index++;
            } else {
                break;
            }
        }
        index--;
        
        int offset = line - X;   // 대각선 끝에서 떨어진 거리
        
        int numerator, denominator;
        
        if (index % 2 == 1) { // 홀수 대각선 → 위에서 아래 방향
            numerator = offset + 1;
            denominator = index - offset;
        } else {              // 짝수 대각선 → 아래에서 위 방향
            numerator = index - offset;
            denominator = offset + 1;
        }
        
        System.out.println(numerator + "/" + denominator);
    }
}
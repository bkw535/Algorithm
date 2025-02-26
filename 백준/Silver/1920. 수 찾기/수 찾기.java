import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        String[] input = br.readLine().split(" ");
        for (String s : input) {
            set.add(Integer.parseInt(s));  // 한 줄을 읽어서 숫자로 변환 후 HashSet에 추가
        }

        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String[] input2 = br.readLine().split(" ");
        for (String s : input2) {
            arr.add(Integer.parseInt(s));
        }

        for(int i = 0; i < m; i++) {
            if(set.contains(arr.get(i))){
                System.out.println(1);
            } else{
                System.out.println(0);
            }

        }

    }
}
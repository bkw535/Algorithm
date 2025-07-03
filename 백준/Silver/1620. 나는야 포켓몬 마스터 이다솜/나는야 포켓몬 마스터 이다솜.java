import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int index = 1;

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, index);
            reverseMap.put(index, name);
            index++;
        }

        for(int i = 0; i < M; i++){
            String input = br.readLine();
            try{
                int x = Integer.parseInt(input);
                sb.append(reverseMap.get(x)).append("\n");
            } catch(NumberFormatException e){
                sb.append(map.get(input)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
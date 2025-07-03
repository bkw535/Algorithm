import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            int m = 0;
            if(log.equals("enter")){
                m = 1;
            }
            map.put(name, m);
        }

        ArrayList<String> person = new ArrayList<String>();
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                person.add(key);
            }
        }
        
        person.sort(Comparator.reverseOrder());
        for(int i=0; i<person.size(); i++){
            sb.append(person.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
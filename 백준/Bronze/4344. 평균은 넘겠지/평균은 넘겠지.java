import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int[] grades = new int[students];
            for(int j=0; j<students; j++) {
                grades[j] = Integer.parseInt(st.nextToken());
            }
            
            int sum = 0;
            int num = 0;
            for(int j=0; j<students; j++) {
                sum+=grades[j];
            }
            double average = (double) sum/students;
            
            for(int j=0; j<students; j++) {
                if(grades[j] > average) num++;
            }
            
            System.out.printf("%.3f%%\n", (double) num / students * 100);
        }
    }
}
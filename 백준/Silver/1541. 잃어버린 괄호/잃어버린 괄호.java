import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        String[] arr = s.split("-");
        int result = 0;
        
        String[] first = arr[0].split("\\+");
        for (String num : first) {
            result += Integer.parseInt(num);
        }
        
        for (int i = 1; i < arr.length; i++) {
            String[] nums = arr[i].split("\\+");
            for (String num : nums) {
                result -= Integer.parseInt(num);
            }
        }
        
        System.out.println(result);
    }
}
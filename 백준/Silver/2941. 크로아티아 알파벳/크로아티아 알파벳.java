import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatiaWord = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String word = br.readLine();
        for(int i = 0; i<croatiaWord.length; i++) {
            word = word.replace(croatiaWord[i], "#");
        }
        
        System.out.println(word.length());
    }
}
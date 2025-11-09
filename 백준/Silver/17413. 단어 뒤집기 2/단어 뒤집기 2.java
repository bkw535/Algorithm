import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder(); 
        StringBuilder tempWord = new StringBuilder(); 

        ArrayList<String> list = new ArrayList<>();

        boolean isTag = false;
        StringBuilder tagBuilder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '<') {
                if (tempWord.length() > 0) {
                    sb.append(tempWord.reverse());
                    tempWord.setLength(0);
                }
                
                isTag = true;
                sb.append(c);
                
                tagBuilder.setLength(0);
                tagBuilder.append(c);

            } else if (c == '>') {
                isTag = false;
                sb.append(c);
                
                tagBuilder.append(c);
                list.add(tagBuilder.toString());

            } else if (isTag) {
                sb.append(c);
                tagBuilder.append(c);

            } else {
                if (c == ' ') {
                    sb.append(tempWord.reverse());
                    sb.append(c);
                    tempWord.setLength(0);
                } else {
                    tempWord.append(c);
                }
            }
        }
        
        if (tempWord.length() > 0) {
            sb.append(tempWord.reverse());
        }

        System.out.println(sb.toString());
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> grade = new HashMap<>();
        grade.put("A+", 4.5);
        grade.put("A0", 4.0);
        grade.put("B+", 3.5);
        grade.put("B0", 3.0);
        grade.put("C+", 2.5);
        grade.put("C0", 2.0);
        grade.put("D+", 1.5);
        grade.put("D0", 1.0);
        grade.put("F", 0.0);

        double sum = 0;
        double deptSum = 0;

        for(int i=0; i<20; i++){
            String line = br.readLine();
            String[] data = line.split(" ");

            double point = Double.parseDouble(data[1]);
            if (Objects.equals(data[2], "P")) continue;
            double value = grade.getOrDefault(data[2], 0.0);

            sum += point*value;
            deptSum += point;
        }

        System.out.println(sum/deptSum);
    }
}
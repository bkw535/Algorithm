import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean flag = false;

        for (int i = 0; i < 3; i++) {
            String a = br.readLine();
            char c = a.charAt(0);

            if (c != 'F' && c != 'B') {
                num = Integer.parseInt(a);
                flag = true;
            }

            if (flag) {
                num++;
            }
        }

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("FizzBuzz");
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }
    }
}
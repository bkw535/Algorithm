import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] a = br.readLine().split(" ");
            int n1 = Integer.parseInt(a[0]);
            int n2 = Integer.parseInt(a[1]);
            int n3 = Integer.parseInt(a[2]);

            if(n1==0 && n2==0 && n3==0)
                break;

            if(n1>n2 && n1>n3){
                if(n1*n1 == n2*n2+n3*n3)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else if(n2>n1 && n2>n3){
                if(n2*n2 == n1*n1+n3*n3)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else if(n3>n2 && n3>n1){
                if(n3*n3 == n2*n2+n1*n1)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }
}

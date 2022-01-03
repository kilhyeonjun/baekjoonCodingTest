import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj9498 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n >= 90)
            System.out.println("A");
        else if (n >= 80)
            System.out.println("B");
        else if (n >= 70)
            System.out.println("C");
        else if (n >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
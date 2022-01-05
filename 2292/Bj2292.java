import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i, sum = 1;
        for (i = 1; sum < n; i++)
            sum += 6 * i;
        System.out.println(i);
    }
}
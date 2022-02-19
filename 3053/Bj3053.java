import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj3053 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        System.out.printf("%.6f\n%.6f", Math.PI * R * R, 2.0 * R * R);
    }
}
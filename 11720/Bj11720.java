import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numStrArr = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += Integer.parseInt(numStrArr[i]);
        System.out.println(sum);
    }
}
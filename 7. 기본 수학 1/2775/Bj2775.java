import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2775 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int k, n;
        int[][] person;
        while (T > 0) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            person = new int[k + 1][n];
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0)
                        person[i][j] = j + 1;
                    else if (j == 0)
                        person[i][j] = 1;
                    else
                        person[i][j] = person[i - 1][j] + person[i][j - 1];
                }
            }
            System.out.println(person[k][n - 1]);
            T--;
        }
    }
}
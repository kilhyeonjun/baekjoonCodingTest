import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2581 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = -1, sum = 0;
        boolean isSosu;
        while (M <= N) {
            if (M > 1) {
                isSosu = true;
                for (int i = 2; i < M; i++) {
                    if (M % i == 0) {
                        isSosu = false;
                        break;
                    }
                }
                if (isSosu) {
                    sum += M;
                    if (min == -1)
                        min = M;
                }
            }
            M++;
        }
        if (min != -1)
            System.out.println(sum + "\n" + min);
        else
            System.out.println("-1");
    }
}
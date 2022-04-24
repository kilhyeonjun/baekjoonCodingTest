import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt5, cnt3, cnt = -1;
        for (cnt5 = N / 5; cnt5 >= 0; cnt5--) {
            cnt3 = (N - cnt5 * 5) / 3;
            if (cnt5 * 5 + cnt3 * 3 == N) {
                cnt = cnt5 + cnt3;
                break;
            }
        }
        System.out.println(cnt);
    }
}
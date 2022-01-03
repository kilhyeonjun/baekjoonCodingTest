import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (isHansu(i))
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isHansu(int num) {
        int prev = num % 10;
        num /= 10;
        int d = num % 10 - prev;
        prev = num % 10;
        while ((num /= 10) != 0) {
            if (d != (num % 10 - prev)) {
                return false;
            }
            prev = num % 10;
        }
        return true;
    }
}
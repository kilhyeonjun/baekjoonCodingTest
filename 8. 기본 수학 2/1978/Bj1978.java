import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int cnt = 0, a;
        boolean isSosu;
        for (String strA : arr) {
            a = Integer.parseInt(strA);
            if (a > 1) {
                isSosu = true;
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        isSosu = false;
                        break;
                    }
                }
                if (isSosu)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
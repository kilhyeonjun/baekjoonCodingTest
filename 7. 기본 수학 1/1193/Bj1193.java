import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int l = 1, pl = 0, d;
        while (true) {
            pl += l;
            if (pl >= x) {
                d = (pl - x);
                if (l % 2 == 0)
                    System.out.printf("%d/%d", l - d, 1 + d);
                else
                    System.out.printf("%d/%d", 1 + d, l - d);
                break;
            }
            l++;
        }
    }
}
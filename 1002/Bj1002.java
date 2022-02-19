import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1002 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int x1, y1, r1, x2, y2, r2;
        double d;
        while (T > 0) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            if (d == 0 && r1 == r2)
                System.out.println(-1);
            else if (d > r1 + r2 || Math.max(r1, r2) > d + Math.min(r1, r2))
                System.out.println(0);
            else if (d == r1 + r2 || d == Math.abs(r1 - r2))
                System.out.println(1);
            else
                System.out.println(2);
            T--;
        }
    }
}
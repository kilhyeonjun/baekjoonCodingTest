import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int H, W, N;
        int xx, yy;
        while (T > 0) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            xx = N / H;
            yy = N % H;
            if (yy == 0) {
                yy = H;
            } else {
                xx++;
                yy = N % H;
            }
            System.out.printf("%d%s\n", yy, xx < 10 ? "0" + xx : "" + xx);
            T--;
        }
    }
}
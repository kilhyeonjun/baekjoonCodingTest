import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj1011 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x, y, d, max;
        for (int T = Integer.parseInt(br.readLine()); T > 0; T--) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            d = y - x;
            max = (int) Math.sqrt(d);
            if (max == Math.sqrt(d))
                bw.write((max * 2 - 1) + "\n");
            else if (d <= max * max + max)
                bw.write((max * 2) + "\n");
            else
                bw.write((max * 2 + 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
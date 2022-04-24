import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj11729 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bw.write((int) (Math.pow(2, N) - 1) + "\n");
        solve(N, 1, 2, 3);
        bw.flush();
        bw.close();
    }

    public static void solve(int N, int start, int pass, int end) throws Exception {
        if (N == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }
        solve(N - 1, start, end, pass);
        bw.write(start + " " + end + "\n");
        solve(N - 1, pass, start, end);
    }
}
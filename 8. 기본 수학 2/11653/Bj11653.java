import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj11653 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while (N > 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N /= i;
                    bw.write(i + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
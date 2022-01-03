import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                bw.write(" ");
            }
            for (k = n - 1 - i; k < n; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
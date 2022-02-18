import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] sosu = new int[N + 1];

        for (int i = 2; i <= N; i++)
            sosu[i] = i;

        for (int i = 2; i <= N; i++) {
            if (sosu[i] == 0)
                continue;
            for (int j = i + i; j <= N; j += i)
                sosu[j] = 0;
        }

        for (int i = M; i <= N; i++)
            if (sosu[i] != 0)
                bw.write(sosu[i] + "\n");

        bw.flush();
        bw.close();
    }
}
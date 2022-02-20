import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Bj2447 {
    public static char[][] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        result = new char[N][N];
        for (int i = 0; i < N; i++)
            Arrays.fill(result[i], ' ');
        drawStar(0, 0, N);
        for (int i = 0; i < N; i++) {
            bw.write(result[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void drawStar(int x, int y, int N) {
        if (N == 1) {
            result[x][y] = '*';
            return;
        }
        int prevN = N / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1)
                    continue;
                drawStar(x + i * prevN, y + j * prevN, prevN);
            }
        }
    }
}
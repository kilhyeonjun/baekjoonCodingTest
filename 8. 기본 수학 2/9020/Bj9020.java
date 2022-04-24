import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj9020 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sosuArr = new int[10000];
        for (int i = 2; i < sosuArr.length; i++)
            sosuArr[i - 1] = i;
        for (int i = 2; i < sosuArr.length; i++) {
            if (sosuArr[i - 1] == 0)
                continue;
            for (int j = i + i; j < sosuArr.length; j += i)
                sosuArr[j - 1] = 0;
        }

        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
            int N = Integer.parseInt(br.readLine());
            int sosu1 = 0, sosu2 = 0;
            if (sosuArr[N / 2 - 1] == 0) {
                for (int j = 1; j < N / 2 - 2; j++) {
                    for (int i = N / 2 + j; i < N; i++) {
                        if (sosuArr[i - 1] != 0) {
                            sosu2 = i;
                            break;
                        }
                    }
                    for (int i = N / 2 - j; i > 1; i--) {
                        if (sosuArr[i - 1] != 0) {
                            sosu1 = i;
                            break;
                        }
                    }
                    if (sosu1 + sosu2 == N)
                        break;
                }
            } else {
                sosu1 = sosu2 = N / 2;
            }
            bw.write(sosu1 + " " + sosu2 + "\n");
            T--;
        }
        bw.flush();
        bw.close();
    }
}
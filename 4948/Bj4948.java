import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sosuArr = new int[123456 * 2];

        for (int i = 2; i < sosuArr.length; i++)
            sosuArr[i - 1] = i;

        for (int i = 2; i < sosuArr.length; i++) {
            if (sosuArr[i - 1] == 0)
                continue;
            for (int j = i + i; j < sosuArr.length; j += i)
                sosuArr[j - 1] = 0;
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0)
                break;

            int cnt = 0;
            for (int i = N + 1; i <= 2 * N; i++)
                if (sosuArr[i - 1] != 0)
                    cnt++;

            System.out.println(cnt);
        }
    }
}
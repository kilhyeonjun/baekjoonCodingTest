import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(cnt));
    }

    public static int fibonacci(int cnt) {
        int[] result = new int[cnt + 1];
        if (cnt >= 0)
            result[0] = 0;
        if (cnt >= 1)
            result[1] = 1;
        for (int i = 2; i <= cnt; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[cnt];
    }
}

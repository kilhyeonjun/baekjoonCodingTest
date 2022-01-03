import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int newNum = n;
        while (true) {
            newNum = newNum % 10 * 10 + (newNum / 10 + newNum % 10) % 10;
            cnt++;
            if (newNum == n)
                break;
        }
        System.out.println(cnt);
    }
}
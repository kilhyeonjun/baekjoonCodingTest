import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        if (N != 1) {
            int cnt = 1;
            while (N != cnt) {
                num++;
                if (String.valueOf(num).contains("666"))
                    cnt++;
            }
        }
        System.out.print(num);
    }
}
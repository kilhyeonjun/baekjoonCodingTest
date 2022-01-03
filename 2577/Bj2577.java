import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String[] arrStr = Integer.toString(a * b * c).split("");
        int[] arrCnt = new int[10];
        for (String str : arrStr) {
            arrCnt[Integer.parseInt(str)]++;
        }
        for (int cnt : arrCnt) {
            System.out.println(cnt);
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n1, n2, n3;
        String result;
        while (true) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            n3 = Integer.parseInt(st.nextToken());
            if (n1 == 0 && n2 == 0 && n3 == 0)
                break;
            if (n1 > n2) {
                if (n1 > n3)
                    result = n1 * n1 == n2 * n2 + n3 * n3 ? "right" : "wrong";
                else
                    result = n3 * n3 == n2 * n2 + n1 * n1 ? "right" : "wrong";
            } else {
                if (n2 > n3)
                    result = n2 * n2 == n1 * n1 + n3 * n3 ? "right" : "wrong";
                else
                    result = n3 * n3 == n2 * n2 + n1 * n1 ? "right" : "wrong";
            }
            System.out.println(result);
        }
    }
}
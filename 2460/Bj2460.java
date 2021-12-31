import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person -= Integer.parseInt(st.nextToken());
            person += Integer.parseInt(st.nextToken());
            if (person > max) {
                max = person;
            }
        }
        System.out.println(max);
    }
}

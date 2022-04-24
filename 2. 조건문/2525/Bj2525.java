import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        if (C > 59)
            A += C / 60;
        B += C % 60;

        if (B > 59)
            A += B / 60;
        B %= 60;

        if (A > 23)
            A %= 24;

        System.out.println(A + " " + B);
    }
}
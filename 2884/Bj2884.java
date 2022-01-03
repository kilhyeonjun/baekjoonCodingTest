import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        minute -= 45;
        if (minute < 0) {
            hour--;
            if (hour < 0)
                hour = 24 + hour;
            minute = 60 + minute;
        }
        System.out.printf("%d %d", hour, minute);
    }
}
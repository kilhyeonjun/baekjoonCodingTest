import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];
        double maxScore = 0.0;
        int num;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            num = Integer.parseInt(st.nextToken());
            if (maxScore < num)
                maxScore = num;
            scores[i] = num;
        }
        for (int score : scores) {
            avg += score / maxScore * 100;
        }
        avg /= scores.length;
        System.out.println(avg);
    }
}
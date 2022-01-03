import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj4344 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int n;
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            int[] scores = new int[n];
            for (int j = 0; j < scores.length; j++)
                scores[j] = Integer.parseInt(st.nextToken());
            // bw.write(String.format("%.3f\n", avg(scores)));
            bw.write(avgStudentPer(scores, avg(scores)));
            bw.newLine();
        }
        bw.flush();
    }

    public static double avg(int[] arr) {
        double avg = 0.0;
        for (int a : arr)
            avg += a;
        avg /= arr.length;
        return avg;
    }

    public static String avgStudentPer(int[] arr, double avg) {
        double per = 0.0;
        for (int a : arr) {
            if (a > avg)
                per++;
        }
        return String.format("%.3f%%", per / arr.length * 100);
    }
}
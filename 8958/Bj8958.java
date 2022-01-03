import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        String[] strArr;
        int sum, point;
        for (int i = 0; i < t; i++) {
            strArr = br.readLine().split("");
            sum = 0;
            point = 0;
            for (String str : strArr) {
                if (str.equals("O")) {
                    point++;
                    sum += point;
                } else
                    point = 0;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
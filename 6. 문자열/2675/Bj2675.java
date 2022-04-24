import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int r, i, j;
        String[] sArr;
        for (i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            sArr = st.nextToken().split("");
            for (String s : sArr)
                for (j = 0; j < r; j++)
                    bw.write(s);
            bw.newLine();
        }
        bw.flush();
    }
}
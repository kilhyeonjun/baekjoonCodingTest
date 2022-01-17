import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] strA = st.nextToken().split(""), strB = st.nextToken().split("");
        int[] A = new int[strA.length], B = new int[strB.length];
        int[] sumArr = new int[strA.length >= strB.length ? strA.length + 1 : strB.length + 1];
        int i, idx, sum = 0;

        for (i = strA.length - 1, idx = 0; i >= 0; i--, idx++)
            A[idx] = Integer.parseInt(strA[i]);
        for (i = strB.length - 1, idx = 0; i >= 0; i--, idx++)
            B[idx] = Integer.parseInt(strB[i]);

        for (i = 0; i < sumArr.length; i++) {
            sum = sumArr[i] + (A.length > i ? A[i] : 0) + (B.length > i ? B[i] : 0);
            if (sum >= 10)
                sumArr[i + 1] = sum / 10;
            if (i != sumArr.length - 1 || sum != 0)
                sb.insert(0, sum % 10);
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
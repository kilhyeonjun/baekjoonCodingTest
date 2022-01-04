import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] strArr1 = st.nextToken().split("");
        String[] strArr2 = st.nextToken().split("");
        int reN1 = Integer.parseInt(reStr(strArr1));
        int reN2 = Integer.parseInt(reStr(strArr2));
        if (reN1 > reN2)
            System.out.println(reN1);
        else
            System.out.println(reN2);

    }

    public static String reStr(String[] arr) {
        String reStr = "";
        for (int i = arr.length; i > 0; i--)
            reStr += arr[i - 1];
        return reStr;
    }
}
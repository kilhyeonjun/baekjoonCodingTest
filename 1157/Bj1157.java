import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class Bj1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().toUpperCase().split("");
        int[] azCnt = new int[26];
        int max = 0;
        char answer = '?';
        for (String str : strArr)
            azCnt[str.charAt(0) - 65]++;
        for (int i = 0; i < azCnt.length; i++) {
            if (max < azCnt[i]) {
                max = azCnt[i];
                answer = (char) (i + 65);
            } else if (max == azCnt[i])
                answer = '?';
        }
        System.out.println(answer);
    }
}
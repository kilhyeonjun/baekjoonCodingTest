import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Bj10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = br.readLine().split("");
        int[] azIndx = new int[26];
        Arrays.fill(azIndx, -1);
        for (int i = 0; i < strArr.length; i++) {
            int strAscii = strArr[i].charAt(0);
            if (azIndx[strAscii - 97] == -1)
                azIndx[strAscii - 97] = i;
        }
        for (int i : azIndx)
            bw.write(i + " ");
        bw.flush();
    }
}
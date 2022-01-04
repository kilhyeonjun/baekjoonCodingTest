import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr;
        String containStr = "";
        int cnt = 0;
        boolean isGroupWord;
        for (int i = 0; i < n; i++) {
            isGroupWord = true;
            strArr = br.readLine().split("");
            for (int j = 0; j < strArr.length; j++) {
                // containStr += strArr[j];
                if (j > 0) {
                    if (!strArr[j - 1].equals(strArr[j])) {
                        if (containStr.contains(strArr[j])) {
                            isGroupWord = false;
                            break;
                        }
                        containStr += strArr[j];
                    }
                } else
                    containStr = strArr[j];
            }
            if (isGroupWord)
                cnt++;
        }
        System.out.println(cnt);
    }
}
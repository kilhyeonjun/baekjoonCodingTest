import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("");
        int sum = 0;
        for (String str : strArr) {
            if (str.charAt(0) < 68)
                sum += 3;
            else if (str.charAt(0) < 71)
                sum += 4;
            else if (str.charAt(0) < 74)
                sum += 5;
            else if (str.charAt(0) < 77)
                sum += 6;
            else if (str.charAt(0) < 80)
                sum += 7;
            else if (str.charAt(0) < 84)
                sum += 8;
            else if (str.charAt(0) < 87)
                sum += 9;
            else if (str.charAt(0) < 91)
                sum += 10;
        }
        System.out.println(sum);
    }
}
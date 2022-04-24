import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Bj4673 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int endValue = 10000, index;
        boolean[] isNotSelfNum = new boolean[endValue];

        for (int i = 1; i <= isNotSelfNum.length; i++) {
            index = d(i);
            if (index > endValue)
                continue;
            isNotSelfNum[index - 1] = true;
        }
        for (int i = 0; i < isNotSelfNum.length; i++) {
            if (!isNotSelfNum[i])
                bw.write(i + 1 + "\n");
        }
        bw.flush();
    }

    public static int d(int n) {
        int result = n;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
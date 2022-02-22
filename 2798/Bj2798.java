import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] cards = new Integer[N];
        st = new StringTokenizer(br.readLine());
        int nearNum = 0;

        for (int index = 0; index < N; index++)
            cards[index] = Integer.parseInt(st.nextToken());

        for (int index = 0; index < N; index++) {
            int sum = 0;
            for (int index2 = index + 1; index2 < N; index2++) {
                for (int index3 = index2 + 1; index3 < N; index3++) {
                    sum = cards[index] + cards[index2] + cards[index3];
                    if (sum > nearNum && sum <= M)
                        nearNum = sum;
                }
            }
        }
        System.out.println(nearNum);
    }
}
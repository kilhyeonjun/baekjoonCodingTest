import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] board = new String[N][M];
        for (int index = 0; index < N; index++)
            board[index] = br.readLine().split("");

        String firstColor = "W", toggleColor = "B";
        int cnt = 0, minCnt = 64;
        for (int x = 0; x < N - 7; x++) {
            for (int y = 0; y < M - 7; y++) {
                cnt = 0;
                for (int index = 0; index < 8; index++) {
                    for (int index2 = 0; index2 < 8; index2++) {
                        if (index != 0 && index2 == 0) {
                            toggleColor = firstColor;
                            if (board[index + x][0 + y].equals(firstColor))
                                cnt++;
                            firstColor = firstColor.equals("B") ? "W" : "B";
                        } else if (board[index + x][index2 + y].equals(toggleColor))
                            cnt++;
                        toggleColor = toggleColor.equals("B") ? "W" : "B";
                    }
                }
                cnt = cnt < 64 - cnt ? cnt : 64 - cnt;
                minCnt = minCnt > cnt ? cnt : minCnt;
            }
        }
        System.out.println(minCnt);
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] persons = new int[N][3];
        for (int index = 0; index < N; index++) {
            st = new StringTokenizer(br.readLine());
            persons[index][0] = Integer.parseInt(st.nextToken());
            persons[index][1] = Integer.parseInt(st.nextToken());
            persons[index][2] = 1;
        }

        for (int index = 0; index < N - 1; index++) {
            for (int index2 = index + 1; index2 < N; index2++) {
                if (persons[index][0] < persons[index2][0] && persons[index][1] < persons[index2][1])
                    persons[index][2]++;
                else if ((persons[index][0] > persons[index2][0] && persons[index][1] > persons[index2][1]))
                    persons[index2][2]++;
            }
        }

        for (int[] person : persons)
            bw.write(person[2] + " ");

        bw.flush();
        bw.close();
    }
}
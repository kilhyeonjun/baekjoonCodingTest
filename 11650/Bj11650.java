import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj11650 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<int[]>();
        for (; N > 0; N--) {
            st = new StringTokenizer(br.readLine());
            int[] temp = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
            list.add(temp);
        }

        list.sort(((o1, o2) -> {
            if (o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            else
                return Integer.compare(o1[0], o2[0]);
        }));

        for (int[] temp : list)
            bw.write(String.format("%d %d\n", temp[0], temp[1]));

        bw.flush();
        bw.close();
    }
}
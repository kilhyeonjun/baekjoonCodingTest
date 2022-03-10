import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Bj1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        String temp;
        for (int index = 0; index < arr.length; index++) {
            temp = br.readLine();
            if (Arrays.asList(arr).contains(temp))
                arr[index] = "";
            else
                arr[index] = temp;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            else
                return o1.length() < o2.length() ? -1 : 1;
        });

        for (int index = 0; index < N; index++) {
            if (arr[index] != "")
                bw.write(arr[index] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
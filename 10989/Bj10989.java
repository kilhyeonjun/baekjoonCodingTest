import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] result = new int[N];
        int max = 0;
        int num;
        for (int i = 0; i < array.length; i++) {
            num = Integer.parseInt(br.readLine());
            array[i] = num;
            if (max < num)
                max = num;
        }
        int[] counting = new int[max + 1];

        for (int i = 0; i < array.length; i++)
            counting[array[i]]++;

        for (int i = 1; i < counting.length; i++)
            counting[i] += counting[i - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for (int number : result)
            bw.write(number + "\n");
        bw.flush();
        bw.close();
    }
}
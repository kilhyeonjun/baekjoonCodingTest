import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj2751 {
    public static int[] numArr;
    public static int[] tmp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        tmp = new int[N];
        for (int index = 0; index < N; index++)
            numArr[index] = Integer.parseInt(br.readLine());

        mergeSort(0, N - 1);
        for (int num : numArr)
            bw.write(num + "\n");
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            int p = start;
            int q = mid + 1;
            int idx = p;
            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && numArr[p] < numArr[q])) {
                    tmp[idx++] = numArr[p++];
                } else {
                    tmp[idx++] = numArr[q++];
                }
            }
            for (int i = start; i <= end; i++) {
                numArr[i] = tmp[i];
            }
        }
    }
}
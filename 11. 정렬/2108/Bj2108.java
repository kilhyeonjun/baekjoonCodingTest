import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2108 {
    public static int[] numArr;
    public static int[] tmp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        tmp = new int[N];
        for (int index = 0; index < numArr.length; index++)
            numArr[index] = Integer.parseInt(br.readLine());
        mergeSort(0, N - 1);
        double sum = 0.0;
        int[] count = new int[8001];
        for (int num : numArr) {
            sum += num;
            count[4000 + num]++;
        }

        int maxCount = 0;
        for (int index = 0; index < count.length; index++) {
            if (count[index] > maxCount)
                maxCount = count[index];
        }

        int countingCnt = 0, maxCntNum = 0;
        for (int index = 0; index < count.length; index++) {
            if (count[index] == maxCount) {
                maxCntNum = index - 4000;
                if (countingCnt == 1)
                    break;
                countingCnt++;
            }
        }

        System.out.println(Math.round(sum / N));
        System.out.println(numArr[N / 2]);
        System.out.println(maxCntNum);
        System.out.println(numArr[N - 1] - numArr[0]);
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
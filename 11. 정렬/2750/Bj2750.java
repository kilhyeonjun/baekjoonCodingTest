import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2750 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int index = 0; index < N; index++)
            arr[index] = Integer.parseInt(br.readLine());
        int temp;
        for (int index = 0; index < N; index++) {
            for (int index2 = index + 1; index2 < N; index2++) {
                if (arr[index] > arr[index2]) {
                    temp = arr[index];
                    arr[index] = arr[index2];
                    arr[index2] = temp;
                }
            }
        }
        for (int num : arr)
            System.out.println(num);
    }
}
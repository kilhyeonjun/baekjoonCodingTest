import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[maxIndex] < arr[i])
                maxIndex = i;
        }
        System.out.printf("%d\n%d", arr[maxIndex], maxIndex + 1);
    }
}
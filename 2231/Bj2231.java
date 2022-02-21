import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int constructor = 0;
        for (int index = 1; index < N; index++) {
            int sum = index;
            String[] numbers = String.valueOf(index).split("");
            for (String number : numbers)
                sum += Integer.parseInt(number);
            if (sum == N) {
                constructor = index;
                break;
            }
        }
        System.out.println(constructor);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870v2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n < 1)
            return 0;
        else if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
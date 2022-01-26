import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj18108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int adYear = Integer.parseInt(br.readLine());
        System.out.println(adYear - 543);
    }
}
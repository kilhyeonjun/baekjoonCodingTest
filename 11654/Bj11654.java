import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj11654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ascii = (int) str.charAt(0);
        System.out.println(ascii);
    }
}
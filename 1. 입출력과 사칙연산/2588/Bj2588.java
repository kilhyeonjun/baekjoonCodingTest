import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2588 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        int onesPlace = n2 % 10;
        int tensPlace = n2 / 10 % 10;
        int hundredsPlace = n2 / 100 % 10;

        System.out.println(n1 * onesPlace);
        System.out.println(n1 * tensPlace);
        System.out.println(n1 * hundredsPlace);
        System.out.println(n1 * onesPlace + (n1 * tensPlace) * 10 + (n1 * hundredsPlace) * 100);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] CroatiaAz = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        for (String croatia : CroatiaAz)
            if (str.contains(croatia))
                str = str.replace(croatia, "?");
        System.out.println(str.length());
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj3009 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] location1 = br.readLine().split(" ");
        String[] location2 = br.readLine().split(" ");
        String[] location3 = br.readLine().split(" ");
        String[] location4 = new String[2];
        if (location1[0].equals(location2[0]))
            location4[0] = location3[0];
        else if (location1[0].equals(location3[0]))
            location4[0] = location2[0];
        else
            location4[0] = location1[0];

        if (location1[1].equals(location2[1]))
            location4[1] = location3[1];
        else if (location1[1].equals(location3[1]))
            location4[1] = location2[1];
        else
            location4[1] = location1[1];

        System.out.println(location4[0] + " " + location4[1]);
    }
}
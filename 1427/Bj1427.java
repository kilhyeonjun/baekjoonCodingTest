import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bj1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();

        for (String temp : br.readLine().split(""))
            list.add(Integer.parseInt(temp));

        list.sort(Comparator.reverseOrder());

        for (int index = 0; index < list.size(); index++)
            System.out.print(list.get(index));
    }
}
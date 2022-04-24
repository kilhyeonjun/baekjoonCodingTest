import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bj2309 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        List<Integer> resultList;
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
        }
        resultList = findDwarfHeight(dwarfs);
        if (resultList != null) {
            for (int result : resultList) {
                System.out.println(result);
            }
        } else {
            System.out.println("없다.");
        }

    }

    public static int listSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> findDwarfHeight(int[] dwarfs) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < dwarfs.length - 1; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                for (int k = 0; k < dwarfs.length; k++) {
                    if (k == i || k == j)
                        continue;
                    resultList.add(dwarfs[k]);
                }
                if (listSum(resultList) == 100) {
                    resultList.sort(Comparator.naturalOrder());
                    return resultList;
                }
                resultList = new ArrayList<Integer>();
            }
        }
        return null;
    }
}
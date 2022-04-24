import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrNum = new int[10];
        List<Integer> remainderList = new ArrayList<Integer>();
        int remainder;

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = Integer.parseInt(br.readLine());
        }

        for (int num : arrNum) {
            remainder = num % 42;
            if (!remainderList.contains(remainder))
                remainderList.add(remainder);
        }

        System.out.println(remainderList.size());
    }
}
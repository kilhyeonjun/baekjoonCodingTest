import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10818 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[cnt];
        int max =  -1000000;
        int min = 1000000;

        for(int i=0; i<cnt; i++){
            intArr[i] =  Integer.parseInt(st.nextToken());
        }
        for(int a : intArr){
            if(max < a){
                max = a;
            }
            if(min > a){
                min = a;
            }
        }
        System.out.println(min + " " + max);
    }
}

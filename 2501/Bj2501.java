import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2501{ 
    public static void main(String[] args){ 
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            System.out.println(getMeasureByOrder(n, k)); 
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    public static int getMeasureByOrder(int n, int k){
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                cnt++;
                if(cnt == k){
                    return i;
                }
            }
        }
        return 0;
    }
}
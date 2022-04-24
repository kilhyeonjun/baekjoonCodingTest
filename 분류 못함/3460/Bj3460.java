import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj3460{ 
    public static void main(String[] args){ 
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            for (int i=0; i<t; i++){
                int n = Integer.parseInt(br.readLine());
                String result = "";
                String  bi = Integer.toBinaryString(n);
                String[] strArr = bi.split("");
                
                for(int j=0; j<strArr.length; j++){
                    if(strArr[strArr.length-j-1].equals("1")){
                        result += j + " ";
                    }
                }
                System.out.println(result);
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
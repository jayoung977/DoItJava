import java.io.*;
import java.util.*; 


public class java_ws_01_02_01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        for (int i = 0; i < 12; i++) {
            System.out.print("월 입력>>");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            if(5>=N & N>=3){
                System.out.println( Integer.toString(N)+ "월은 봄입니다.");
            }
            else if(8>=N & N>=6){
                System.out.println( Integer.toString(N)+ "월은 여름입니다.");
            }else if(11>=N & N>=9){
                System.out.println( Integer.toString(N)+ "월은 가을입니다.");
            }else{
                System.out.println( Integer.toString(N)+ "월은 겨울입니다.");
            }
            
        }
 
        


    }

}

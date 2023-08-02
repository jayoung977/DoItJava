import java.io.*;
import java.util.*; 


public class java_ws_01_02_02 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int i = 0;
        while (i <3) {
            System.out.print("월 입력>>");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            switch(N){
                case 3,4,5: 
                    System.out.println( Integer.toString(N)+ "월은 봄입니다.");
                    i++;
                    break;
                case 6,7,8: 
                    System.out.println( Integer.toString(N)+ "월은 여름입니다.");
                    i++;
                    break;
                case 9,10,11: 
                    System.out.println( Integer.toString(N)+ "월은 가을입니다.");
                    i++;
                    break;
                case 12,1,2: 
                    System.out.println( Integer.toString(N)+ "월은 겨울입니다.");
                    i++;
                    break;             
                default:
                    System.out.println("없는 월입니다.");
                    i++;
                    break;
                

            }


        }
 
        


    }

}

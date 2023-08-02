import java.util.Arrays;

public class java_ws_01_03_01 {
    public static void main(String[] args) {
        int N =15;
        int k =1;
        int [][] arr =new int[5][5]; 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j>=i){
                    System.out.printf("%4d",k);
                    k++;
                }else{
                     System.out.printf("%4s"," ");
                }
            }System.out.println();    
        }
        
    }
        
}

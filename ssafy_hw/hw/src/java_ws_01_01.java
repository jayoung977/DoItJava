import java.io.*;
// import java.util.*;
public class java_ws_01_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=1; i < N+1; i++){
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println(sum);
    } 
}

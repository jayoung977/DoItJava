import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * java_ws_01_03_02
 */
public class java_ws_01_03_02 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int num=1;
        for (int i = 0; i <N; i++) {
            int calculateJ = (Math.abs(i-N/2)*2+1);
            for (int k = 0; k < (N-calculateJ)/2; k++) {
                sb.append(" ");
            }
            for (int j=0;j<calculateJ;j++){
                sb.append(Integer.toString(num));
                num++;

            }
            for (int k = 0; k < (N-calculateJ)/2; k++) {
                sb.append(" ");
            }
            sb.append("\n");
        }System.out.println(sb);
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class java_ws_01_04 {
    public static void main(String[] args) throws IOException {
        System.out.println("60갑자를 입력하시오: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String gabja = br.readLine();
        String [] shipganzi = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};
        String [] shipisy = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

    
        for(int i=1800;i<2101;i++){
            if(gabja.equals("종료")){
                break;
            }
            String[] gabjaArr = gabja.split("");
            int ganzi = Arrays.asList(shipganzi).indexOf(gabjaArr[0]); 
            int isy  = Arrays.asList(shipisy).indexOf(gabjaArr[1]);
            
            if((i-1444)%10==ganzi & (i-1444)%12==isy){
                sb.append(i+" ");
            }

        }System.out.println(sb);


    }
}

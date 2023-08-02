import java.io.*;
import java.util.*;

/**
 * java_ws_01_03_03
 */
public class java_ws_01_03_03 {
    static int myCnt=0;
    static int comCmt=0;
    static int equalCmt=0;
    static int compterAction;

    public static void game(int winAction, int equalAction){
        if(compterAction==winAction){
            System.out.println("이겼습니다");
            myCnt++;
        }else if(compterAction==equalAction){
            System.out.println("비겼습니다");
            equalCmt++; //비겨도 이긴건 아니니까 컴퓨터 승리로 판정
        }else{
            System.out.println("졌습니다");
            comCmt++;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
        System.out.println("1. 5판 3승");
        System.out.println("2. 3판 2승");        
        System.out.println("3. 1판 1승");
        System.out.print("번호를 입력하세요.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        int nT;        
        int win;

        if(T==1){
            nT=5;
            win=3;
        }else if(T==2){
            nT=3;
            win=2;
        }else if(T==3){
            nT=1;
            win=1;           
        } else{
            System.out.println("숫자를 잘못입력했습니다.");
            nT=0;
            win=0;  
        }



        for (int i = 0; i < nT; i++) {
            
            if(myCnt >= win){
                System.out.println("###내가 승!!!");
                break;
            }else if(comCmt >= win ){
                System.out.println("###컴퓨터 승!!!");
                break;
            }else if (equalCmt >= win) {
                System.out.println("###비겼습니다!!!");
                break;                
            } 
            System.out.print("가위바위보 중 하나 입력: ");
            String action = br.readLine();
            compterAction = (int) (Math.random() * 3) +1; 
            switch(action){
                case "가위":
                    game(2,1);
                    break;
                case "바위":
                    game(3,2);
                    break;
                default:
                    game(1,3);
                    break;               
            }if(myCnt >= win){
                System.out.println("###내가 승!!!");
                break;
            }else if(comCmt >= win ){
                System.out.println("###컴퓨터 승!!!");
                break;
            }else if (equalCmt >= win | (equalCmt==myCnt & equalCmt==comCmt)) {
                System.out.println("###비겼습니다!!!");
                break;                
            } 
        
        

          

            
            
        }
    }
}
   
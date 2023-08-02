package java0801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_d3_6808_규영이와인영이의카드게임 {

  static int[] kycards= new int[9];
  static int[] iycards= new int[9];
  static boolean[] visited  = new boolean[9];
  static int[] iteriycards = new int[9];
  static int kywin;
  static int iywin;

  public static void main(String[] args)
    throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for (int i = 1; i <= T; i++) {

      // 인영이의 카드 icards
      boolean[] numeric = new boolean[19];
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < 9; j++) {
        kycards[j] = Integer.parseInt(st.nextToken());
        numeric[kycards[j]] = true;
      }
      // 규영이의 카드 kcards
      int temp = 0;
      for (int j = 1; j <= 18; j++) {
        if (!numeric[j]) {
          iycards[temp] = j;
          temp++;
        }
      }
      kywin=0; //여기서 초기화 (배열로 했더니 메모리 초과됨)
      iywin=0;
      perm(0,i-1); // i-1한 이유는 kwins에서는 0부터 시작해서  
      System.out.printf("#%d %d %d",i,kywin,iywin);
      System.out.println();
    }
  }

  static void perm(int cnt,int t) {
    if (cnt == 9) {
    
      // 규영이와 인영이의 싸움
      fight(iteriycards,t);
      
      return ;
    }
    for (int i = 0; i < 9; i++) {
      if (visited[i]) continue; 
      visited[i] = true;
      iteriycards[cnt] = iycards[i]; 
      perm(cnt + 1,t); 
      iteriycards[cnt] = 0; 
      visited[i] = false;
    }
  }
  static void fight(int[] iteriycards, int t) {
      int iysum =0;
      int kysum=0;
    	
      for (int i = 0; i < 9; i++) {
		if(iteriycards[i] > kycards[i]){
			iysum += (iteriycards[i]+kycards[i]);
		}else{
			kysum += (iteriycards[i]+kycards[i]);
		}
	  }
      if(kysum>iysum) kywin++; //규영이가 이기는경우 answer 증가시킴.
      else if(kysum<iysum) iywin++; //비기는 경우도 있음 그냥 else xx
  }
}

//4
//1 3 5 7 9 11 13 15 17
//18 16 14 12 10 8 6 4 2
//13 17 9 5 18 7 11 1 15
//1 6 7 9 12 13 15 17 18

package java0801;

import java.io.*;
import java.util.*;

public class SWEA_d5_1265_달란트3 {
	static int N;
	static int P;
	static int Q;
	static int R;
   
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
		    P = Integer.parseInt(st.nextToken());
		    Q = N/P;
		    R =	N%P;
		    
		    double ans = Math.pow(Q+1,R) * Math.pow(Q,P-R);
			
		    System.out.printf("#%d %.0f",i,ans);
		    System.out.println();
		}
	}
	
}


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

package java0801;

import java.io.*;
import java.util.*;

public class SWEA_d5_1265_달란트2 {
	static int N;
	static int R;
	static int maxNum;
	static int[] p;
	static int[] nums;
   
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			R = R-1; //작대기 수
			nums = new int[R];
			p= new int[N-1];
			for(int j=0;j<N-1;j++) {
				p[j]=j+1;
			}
			maxNum=0;
			combi(0,0);
			System.out.printf("#%d %d",i,maxNum);
			System.out.println();
		}
	}
	static void combi(int cnt, int start) {
		if(cnt==R) {
			int result = nums[0];
			//작대기 2개 이상때만
			if(R>=2) {
				for(int j=1;j<nums.length;j++) {
					result *=(nums[j]-nums[j-1]);
				}
			}
			result*=(N-nums[nums.length-1]); //마지막
			maxNum = Math.max(result, maxNum);
			return;
		}for(int j=start;j<N-1;j++) {
			nums[cnt]=p[j];
			combi(cnt+1,j+1);
		}
		
		
	}
}




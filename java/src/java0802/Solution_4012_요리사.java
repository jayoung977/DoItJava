package java0802;

import java.io.*;
import java.util.*;

public class Solution_4012_요리사 {
    static int T;
    static int N;
    static int R;
    static int[][] data; 
    static int answer;
	static int[] aNums;
	static boolean[] numeric;
	static int[] p;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T;i++) {
            N = Integer.parseInt(br.readLine());
            R = N/2; //각 A,B가 갖는 음식 개수 R
            p = new int[N]; //전체 음식 
            //N*N 데이터 입력 받기
            data = new int[N][N];
            for(int j=0;j<N;j++) {
            	p[j]=j; //0~N-1
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<N;k++) {
                    data[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            //초기화
            aNums = new int[R];
            numeric = new boolean[N];
            answer=Integer.MAX_VALUE;
            
            //1.A가 갖는 음식 N/2개 고르는 조합
            combi(0,0);
            
            System.out.printf("#%d %d",i,answer);
            System.out.println();
        }
    }
	static void combi(int cnt, int start) {
		if(cnt==R) {
			//2.시너지 계산
			calsynergy(aNums,numeric);
			return;
		}
		for(int i=start;i<N;i++) {
			aNums[cnt]=p[i];
			//numeric은 전체 N 중 A에 해당하면 true저장
			numeric[aNums[cnt]]=true;
			combi(cnt+1,i+1);
			numeric[aNums[cnt]]=false;
		}
		
	}
	static void calsynergy(int[] aNums, boolean[] numeric) {
		//2-1. numeric 이용해서 B의 음식 N/2 저장
		int [] bNums = new int[R];
		int index = 0;
		for(int i=0;i<N;i++) {
			if (numeric[i]==false) {
				bNums[index]=i;
				index++;
			}
		}
		//2-2. for문으로 순열 - 각 A와 B에서의 음식시너지의 총합 계산
		int aSum= 0;
		int bSum= 0;
		for(int i=0;i<R;i++) {
			for(int j=0; j<R;j++) {
				if(aNums[i]!=aNums[j]) {
					aSum+=data[aNums[i]][aNums[j]];
				}		
				if(bNums[i]!=bNums[j]) {
					bSum+=data[bNums[i]][bNums[j]];
				}	
			}
		}	
		//2-3. 최솟값 구하기
		answer=Math.min(Math.abs(aSum-bSum),answer);
	}

}
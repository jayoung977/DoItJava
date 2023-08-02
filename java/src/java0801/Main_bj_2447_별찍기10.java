package java0801;

import java.util.Scanner;

public class Main_bj_2447_별찍기10 {
    
	static int N;
	static int[][] star;
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		N =scann.nextInt();
		star = new int[N][N];
		
		star(0,0,N); //옆으로 n개 

		StringBuilder sb=new StringBuilder(); //뮤
		for (int i = 0; i < N; i++) {
			for( int j = 0 ; j < N; j++ ) {
				sb.append(star[i][j]==1 ? "*":" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString()); //이뮤터
	}
	static void star(int r, int c, int n) {
		//끝나는 조건
		if(n==3) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(i==1 && j ==1) continue; //다음 스텝 -> 중앙일 때 아무일도 안함 
					star[r+i][c+j]=1;  //중앙 아닌 나머지 1
					
				}
				
			} 
		}else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(i==1 && j ==1) continue;  //다음 스텝 -> 중앙일 때 아무일도 안함 
					star(r+i*n/3, c+j*n/3, n/3); //가장 큰걸 9등분할
			
				}
			}

		}
	}
}
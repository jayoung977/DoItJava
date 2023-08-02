package java0801;

import java.util.Scanner;

public class Main_bj_11729_하노이탑 {
	static int N;
	static StringBuilder sb;
	public static void main(String[] args) {
		
	
		Scanner scann=new Scanner(System.in);
		N=scann.nextInt();
		sb=new StringBuilder();
		hanoi(N);
		System.out.println((1<<N)-1);
		System.out.println(sb.toString());
	}
	private static void hanoi(int n) {
		hanoi(n,1,3,2);
	}
	private static void hanoi(int n, int a, int b, int c) {
		if(n==1) {
			sb.append(a+" "+b+"\n");
			return;
		}
		hanoi(n-1,a,c,b);
		sb.append(a+" "+b+"\n");
		hanoi(n-1,c,b,a); 
	}
}

//3
//7
//1 3
//1 2
//3 2
//1 3
//2 1
//2 3
//1 3

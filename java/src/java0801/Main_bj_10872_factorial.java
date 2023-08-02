package java0801;

import java.util.Scanner;

public class Main_bj_10872_factorial {
	static int N;
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		N=scann.nextInt();
		System.out.println(fact(N));
	}
	//call stack
	private static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}else return n*fact(n-1);
	}
}
//10
//3628800
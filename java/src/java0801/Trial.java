package java0801;

import java.util.Arrays;

public class Trial {
	static int[] p= {1,2,3,4,5};
	static int N=p.length;
	static int R;
	static boolean[] visited;
	static int count;
	static int[] nums;
	public static void main(String[] args) {
		R=3;
		nums=new int[R];
		visited=new boolean[N];
		count=0;
		perm(0);
		System.out.println(count);
	}
	static void perm(int cnt) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			StringBuilder sb =new StringBuilder();
			for (int i = 0; i < nums.length; i++) {
				if(int)
			}
		}
	}
	
}

package java0801;

import java.util.Arrays;

//nCr -visited 없는 버전 
public class CombinationTest2 {
	static int[] p= {1,2,3,4,5};
	static int N=p.length;
	static int R;
	static int count;
	static int[] nums;
	public static void main(String[] args) {
		R=3;
		nums=new int[R];
		count=0;
		combi(0,0);
		System.out.println(count);
	}
	static void combi(int cnt, int start) { 
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return; //중요!!!!
		}for (int i = start; i < N; i++) {
			nums[cnt]=p[i]; //많이 틀림 
			combi(cnt+1,i+1); //3이전에는 밑으로 안내려감 
		}
	}
}

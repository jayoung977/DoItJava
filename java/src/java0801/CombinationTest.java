package java0801;

import java.util.Arrays;

//nCr -visited 있는 버전 
public class CombinationTest {
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
		combi(0,0);
		System.out.println(count);
	}
	static void combi(int cnt, int start) { 
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			StringBuilder sb =new StringBuilder();
			for (int i = 0; i < N; i++) {
				if(!visited[i])sb.append(p[1]+" ");
			}
			sb.append("\n");
			System.out.println(sb.toString());
			return;
		}for (int i = start; i < N; i++) {
			visited[i]=true;
			nums[cnt]=p[i]; //많이 틀림 
			combi(cnt+1,i+1); //3이전에는 밑으로 안내려감 
			nums[cnt]=0; //2일때 0
			visited[i]=false;
		}
	}
}

package java0801;

import java.util.Arrays;

//nPr
//n! =10~12!
public class PermTest {
	static int[] p= {1,2,3,4,5};
	static int N=p.length;   //n이 3개일때는 그냥 다중 for문이 나음
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
	static void perm(int cnt) { //메모리 부족으로 백트래킹이 어려움 - 프루닝 생김
		if(cnt==R) {
			//로직-> 메서드로 빼기
			count++;
			System.out.println(Arrays.toString(nums));
			StringBuilder sb =new StringBuilder();
			for (int i = 0; i < N; i++) {
				if(!visited[i])sb.append(p[1]+" ");
			}
			sb.append("\n");
			System.out.println(sb.toString());
			return;
		}for (int i = 0; i < N; i++) {
			if(visited[i])continue; //방문했으면 다음 스텝
			visited[i]=true;
			nums[cnt]=p[i]; //많이 틀림 
			perm(cnt+1); //3이전에는 밑으로 안내려감 
			nums[cnt]=0; //2일때 0
			visited[i]=false;
		}
	}
}
//[1, 2, 3]
//2 2 
//
//[1, 2, 4]
//2 2 
//
//[1, 2, 5]
//2 2 
//
//[1, 3, 2]
//2 2 
//
//[1, 3, 4]
//2 2 
//
//[1, 3, 5]
//2 2 
//
//[1, 4, 2]
//2 2 
//
//[1, 4, 3]
//2 2 
//
//[1, 4, 5]
//2 2 
//
//[1, 5, 2]
//2 2 
//
//[1, 5, 3]
//2 2 
//
//[1, 5, 4]
//2 2 
//
//[2, 1, 3]
//2 2 
//
//[2, 1, 4]
//2 2 
//
//[2, 1, 5]
//2 2 
//
//[2, 3, 1]
//2 2 
//
//[2, 3, 4]
//2 2 
//
//[2, 3, 5]
//2 2 
//
//[2, 4, 1]
//2 2 
//
//[2, 4, 3]
//2 2 
//
//[2, 4, 5]
//2 2 
//
//[2, 5, 1]
//2 2 
//
//[2, 5, 3]
//2 2 
//
//[2, 5, 4]
//2 2 
//
//[3, 1, 2]
//2 2 
//
//[3, 1, 4]
//2 2 
//
//[3, 1, 5]
//2 2 
//
//[3, 2, 1]
//2 2 
//
//[3, 2, 4]
//2 2 
//
//[3, 2, 5]
//2 2 
//
//[3, 4, 1]
//2 2 
//
//[3, 4, 2]
//2 2 
//
//[3, 4, 5]
//2 2 
//
//[3, 5, 1]
//2 2 
//
//[3, 5, 2]
//2 2 
//
//[3, 5, 4]
//2 2 
//
//[4, 1, 2]
//2 2 
//
//[4, 1, 3]
//2 2 
//
//[4, 1, 5]
//2 2 
//
//[4, 2, 1]
//2 2 
//
//[4, 2, 3]
//2 2 
//
//[4, 2, 5]
//2 2 
//
//[4, 3, 1]
//2 2 
//
//[4, 3, 2]
//2 2 
//
//[4, 3, 5]
//2 2 
//
//[4, 5, 1]
//2 2 
//
//[4, 5, 2]
//2 2 
//
//[4, 5, 3]
//2 2 
//
//[5, 1, 2]
//2 2 
//
//[5, 1, 3]
//2 2 
//
//[5, 1, 4]
//2 2 
//
//[5, 2, 1]
//2 2 
//
//[5, 2, 3]
//2 2 
//
//[5, 2, 4]
//2 2 
//
//[5, 3, 1]
//2 2 
//
//[5, 3, 2]
//2 2 
//
//[5, 3, 4]
//2 2 
//
//[5, 4, 1]
//2 2 
//
//[5, 4, 2]
//2 2 
//
//[5, 4, 3]
//2 2 
//
//60

package java0801;

public class TimeTest {

	public static void main(String[] args) {
		int sum=0;
		long ct=System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			sum+=i;
			sum-=i;
		}
		System.out.println(sum);
		System.out.println(System.nanoTime()-ct); //100000 870200 0.8초 , 1000000000 (10억)1583300 1.5초 
		//삼성거 1.7초 , 5억이 1초  
		//10^9면? 2초 걸림
	}

}

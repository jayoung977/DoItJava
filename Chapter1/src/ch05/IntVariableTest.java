package ch05;

public class IntVariableTest {
	public static void main(String[] args) {
		byte bs = -128; //-128~127까지 가능 -2^7~2^7-1
		System.out.println(bs);
		
//		int iVal = 12345678900; //int 범위 넘어섰음 (-2^31 ~2^31-1)
		long iVal = 12345678900L; //L을 뒤에붙여야함, 이숫자의 의미: 4바이트에 못들어가는 숫자
		//기본자료형이 int, 4바이트이므로 이상일 경우 L을 붙여 Long이라고 표시함
	}
}

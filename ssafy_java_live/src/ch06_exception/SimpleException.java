package ch06_exception;

public class SimpleException {
	public static void main(String[] args) {
		int [] intArray = {10}; //첫번째 인덱스만 가짐
		System.out.println(intArray[2]); //2번 인덱스를 호출하면? -> 예외발생
		// 그러나 위의 코드는 컴파일은 (O)
		System.out.println("프로그램 종료합니다");
	}

}

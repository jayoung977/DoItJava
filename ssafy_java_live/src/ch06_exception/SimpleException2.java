package ch06_exception;

public class SimpleException2 {
	public static void main(String[] args) {
		int [] intArray = {10};
		try {
			System.out.println(intArray[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외처리 완료!!"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료합니다");
	}

}

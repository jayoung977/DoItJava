package ch07;

public class CharacterTest {
	
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //A
		System.out.println((int)ch1); //65
		
		
		char ch2 = 66; //B
		System.out.println(ch2);
//		System.out.println((int)ch1);
		
		
		char ch3 = '한';
		char ch4 = '\uD55C';
		System.out.println(ch3); //한
		System.out.println(ch4); //한
		
	}
}

package ch08;


public class LocalVariableType {
	public static void main(String[] args) {
		var i =10;
		var j =10.0;
		var str = "hello";
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		str = "test2"; //가능
		//str = "2"; 이미 선언되어서다른타입 자료 넣을 수 없다. 
		System.out.println(str);
		
	}

}

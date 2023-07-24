package ch04_oop3.encapsulation;


class SingletonClass {
	//TODO: SingletoneClass에 Singleton Design Pattern을 적용하시오.
	//생성자를 private로 했으니까 자신밖에 생성 못함 
	// = 멤버 변수 
	// -> 소중하니까 private 설정
	// -> getter/setter method 작성
	private static SingletonClass sc = new SingletonClass();
	
	//getter로 값을 부르려면 또 reference가 필요함 
	//객체를 만들 수 없으므로 reference를 얻을 수 없음
	//객체를 만들지 않고도 메모리에 미리 올려놓는 방법 -> static 사용 
	//생성자를 static하게 만들려고 하니 return sc가 발목잡음  
	//-> 객체 생성부분까지 static으로 만듦
	public static SingletonClass getInstance() {
		return sc;
	}
	
	//외부에서 setter로 값을 입력불가 (객체 생성 불가하므로) 
	// ->setter가 필요없어지므로 생략됨
//	public void setInstance(SingletonClass sc) {
//		this.sc =sc;
//	}
	
	//END
	
	private SingletonClass(){
		System.out.println("100만원 추가요!");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}


public class SingletonTest {
	public static void main(String args[]) {
			SingletonClass sc = SingletonClass.getInstance();
			sc.sayHello();
			SingletonClass sc2 = SingletonClass.getInstance();
			sc2.sayHello();
			//new SigletonClass(); 안됨 이게 보장되야 singleton Design Pattern이라 할 수 있다!
	}
}

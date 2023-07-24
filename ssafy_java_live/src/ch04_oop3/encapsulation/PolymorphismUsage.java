package ch04_oop3.encapsulation;

public class PolymorphismUsage {
	public void useObjectArray() {
		//TODO: Object []을 선언하고 다양한 객체를 저장하고 저장된 클래스 타입 출력하세요.
		Object [] objs = new Object[5];
		objs[0]="hello";
		objs[1]=objs;
		objs[2]=new Object();
		objs[3]=Integer.valueOf(3);
		objs[4]=3; // 3-> Integer
		
		for(Object obj: objs) {
			System.out.println(obj+" : "+obj.getClass().getName());
		}
				
		//END
		
	}
//	public void useObjectParam() {
//		System.out.println(1);
//		System.out.println("hello");
//		System.out.println(new Person("피터파커"));
//		System.out.println(new SpiderMan("피터파커",true));
//	}
//	public void polyTest() {
//		SpiderMan sman = new SpiderMan("피터",true);
//		Person p = sman; //부모타입에서 참조 가능1
//		Object o = sman; //부모타입에서 참조 가능2
//		
//	}
	public static void main(String[] args) {
		PolymorphismUsage usage = new PolymorphismUsage();
		usage.useObjectArray();
//		usage.useObjectParam();
	}
}

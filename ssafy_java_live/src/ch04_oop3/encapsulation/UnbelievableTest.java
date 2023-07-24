package ch04_oop3.encapsulation;


class UnbelievableUserInfo {
	//이름은 null이 될 수 없다.
	private String name = "홍길동";
	//계좌는 0보다 커야한다.
	private int account = 1000;
	
	public UnbelievableUserInfo() {} //기본생성자 생성
	
	public UnbelievableUserInfo(String name, int account) {
		this.name = name;
		this.account = account;
	}
	//TODO: name과 account에 부적절한 값이 할당되지 못하도록 처리하시오.
	//name과 account는 private으로 변경되어야 한다.
	public void setName(String name) {
		if(name == null) {
			System.out.println("이름은 null이 될 수 없다.");
			return ;
		}
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setAccount(int account) {
		if(account < 0) {
			System.out.println("account는 마이너스가 될 수 없다.");
			return ;
		}
		this.account = account;
	}
	public int getAccount() {
		return this.account;
	}
	//END
}
public class UnbelievableTest {
	public static void main(String args[]) {
		UnbelievableUserInfo info = new UnbelievableUserInfo(); //기본생성자() -> 만들어줘야
		System.out.printf("사용자 정보: %s,%d%n", info.getName(), info.getAccount());
//		info.name = null;
//		info.account = -1000;
		info.setName(null);
		info.setAccount(-1000);
		System.out.printf("사용자 정보: %s,%d%n", info.getName(), info.getAccount());
		
	}
	
}

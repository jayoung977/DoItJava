package ch05_oop4.charge_interface;

//TODO: HandPhone을 충전 가능하게 설정하시오.
public class HandPhone extends Phone implements Chargeable{
	//TODO: Chargeable을 구현하시오.
	@Override
	public void charge() {
		System.out.println("핸드폰 충전.");
	}
	
	//END

}

package ch05_oop4.charge_interface;

//TODO: DigitalCamera를 충전 가능하게 설정하시오.
public class DigitalCamera extends Camera implements Chargeable {
	//TODO: Chargeable을 구현하시오.
	@Override
	public void charge() {
		System.out.println("디카 충전.");
	}
	//END
}

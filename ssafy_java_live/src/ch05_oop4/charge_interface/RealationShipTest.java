package ch05_oop4.charge_interface;

public class RealationShipTest {
	public static void main(String args[]) {
// 1. Interface 사용 X
//		Object[] objs = {new HandPhone(), new Camera(), new Phone(),new DigitalCamera() };
//		for(Object obj:objs) {
//			if(obj instanceof HandPhone) {
//				Chargeable c = (Chargeable) obj;
//				c.charge();
//				
//			}else if(obj instanceof DigitalCamera) {
//				Chargeable c = (Chargeable) obj;
//				c.charge();
//			}
//		}	
// 2. Interface 사용 O
		// TODO: 충전 가능한 객체들을 충전하시오.
		Chargeable [] chargeables = {new HandPhone(),new DigitalCamera() };
		for (Chargeable c: chargeables) {
			c.charge();
		}
		//END
	}

}

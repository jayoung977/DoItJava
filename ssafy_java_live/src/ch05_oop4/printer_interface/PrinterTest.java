package ch05_oop4.printer_interface;

public class PrinterTest {
	public static void main(String args[]) {
		PrintClient client = new PrintClient();
		client.setPrinter(new DotPrinter());
		//TODO:client가 LaserPrinter를 사용하도록 하고 클래스의 변화를 확인하시오.
		client.setPrinter(new LaserPrinter());
		//END
		client.printThis("myfile");
	}

}
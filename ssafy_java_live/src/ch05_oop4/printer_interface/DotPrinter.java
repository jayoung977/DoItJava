package ch05_oop4.printer_interface;

public class DotPrinter implements Printer {

	@Override
	public void print(String fileName) {
		System.out.println("Dot Printer로 " 
	+fileName+"을 프린트 한다.");
	}

}

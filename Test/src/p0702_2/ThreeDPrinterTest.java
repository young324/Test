package p0702_2;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
	
		Powder p1 = new Powder();
		printer.setMeterial(p1);//Powder객체를 Object객체로 넣는다.

		Powder p2 = (Powder)printer.getMeterial();
		//Object타입을 다운캐스팅
		System.out.println(p2);
	}
}
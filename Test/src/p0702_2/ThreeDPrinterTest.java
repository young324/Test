package p0702_2;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
	
		Powder p1 = new Powder();
		printer.setMeterial(p1);//Powder��ü�� Object��ü�� �ִ´�.

		Powder p2 = (Powder)printer.getMeterial();
		//ObjectŸ���� �ٿ�ĳ����
		System.out.println(p2);
	}
}
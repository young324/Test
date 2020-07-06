package p0702_2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMeterial(new Powder());
		Powder powder=powderPrint.getMeterial();
		System.out.println(powder);
		
		powder.doPrinting();
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		plasticPrint.setMeterial(new Plastic());
		Plastic plastic = plasticPrint.getMeterial();
		System.out.println(plastic);
		
		plastic.doPrinting();

		
		/*//Water�� Meteral�� ���������� �ʾҴ�.
		 * GenericPrinter<Water> waterPrint = new GenericPrinter<Water>();
		 * waterPrint.setMeterial(new Water()); Water water = waterPrint.getMeterial();
		 * System.out.println(water);
		 */
	}
}
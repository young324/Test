package p0702_2;

public class Powder extends Meterial{

	@Override
	public String toString() {
		return "���� Powder";
	}

	@Override
	public void doPrinting() {
		System.out.println("overriding powder");
	}

}

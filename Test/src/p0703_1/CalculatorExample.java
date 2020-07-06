package p0703_1;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		System.out.println(myCalc.plus(5, 2));
		myCalc.powerOff();
		
	}
}
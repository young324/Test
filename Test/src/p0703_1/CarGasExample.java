package p0703_1;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCarGas = new CarGas();
		myCarGas.setGas(10);
		myCarGas.run();
		
		//boolean gasState=
				
		/*
		 * if(gasState) { System.out.println("����մϴ�."); }
		 */
		//������ �ʿ�����
		if(myCarGas.isLeftGas()) {
			System.out.println("������ �ʿ��մϴ�");
		}
	}

}

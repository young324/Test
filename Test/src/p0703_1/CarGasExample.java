package p0703_1;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCarGas = new CarGas();
		myCarGas.setGas(10);
		myCarGas.run();
		
		//boolean gasState=
				
		/*
		 * if(gasState) { System.out.println("출발합니다."); }
		 */
		//주유의 필요유무
		if(myCarGas.isLeftGas()) {
			System.out.println("주유가 필요합니다");
		}
	}

}

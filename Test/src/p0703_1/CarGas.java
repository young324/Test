package p0703_1;

public class CarGas {
	//필드
	int gas;
	//생성자
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		//gas가 0이면 gas가 없습니다. ->false 
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return true;
		}else
			return false;
	}
	void run() {
		//gas가 0보다 크면 달립니다 , gas보유량 출력
		while(true) {
			if(gas>0) {
				System.out.println("달립니다 ," + "가스 보유량 : "+gas);
				gas -=1;
			}else {
				System.out.println("멈춥니다");
				return;
			}			
		}
		
	}
}
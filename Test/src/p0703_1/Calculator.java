package p0703_1;

public class Calculator {
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
			
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	int sum2(int...i) { //��� ���� �𸣸� ...
		return 0;
		
	}
}
package p0703_1;

public class Computer {
	//�޼���1
	int[] values =new int[] {1,2,3};
	
	int sum1(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	//�޼���2
	int sum2(int ...values) {//����� �𸣰ھ�
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
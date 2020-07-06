package p0703_1;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom=new Computer();
		System.out.println("-------- sum1 유형 1 ---------");
		int[] values= {1,2,3};
		int result=myCom.sum1(values);
		System.out.println("result : "+result);
		
		System.out.println("-------- sum1 유형 2 ---------");
		int result2=myCom.sum1(new int[] {1,2,3});
		System.out.println("result2 : "+result2);
		
		System.out.println("-------- sum2 유형1 ---------");
		int result3=myCom.sum2(1,2,3,4,5);//int ...values
		System.out.println("result3 : "+result3);
	}
}
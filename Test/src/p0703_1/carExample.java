package p0703_1;

public class carExample {
	public static void main(String[] args) {
		System.out.println("---------필드활용 1----------");
		car car1 = new car();
		System.out.println("car1.company : "+car1.company);
		//초기화된 필드지만 변경 가능하다.
		
		System.out.println("---------필드활용 2----------");
		car car2 = new car("소나타");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		
		System.out.println("---------필드활용3----------");
		car car3 = new car("소나타","빨강");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.company : "+car3.model);
		System.out.println("car3.company : "+car3.color);
		
		System.out.println("---------필드활용4----------");
		car car4 = new car("택시","검정",200);
		System.out.println("car4.company : "+car4.color);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
	}
}
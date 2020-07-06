package p0701;

public class EqualTest {
	public static void main(String[] args) {
		Student stuLee = new Student(100,"이상윤");
		Student stuLee2 = stuLee;
		Student stuSang = new Student(100,"이상원");
	
		if(stuLee==stuLee2) {
			System.out.println("주소가 같습니다.");
		}else
			System.out.println("주소가 다릅니다.");
		
		if(stuLee.equals(stuLee2)) {
			System.out.println("같다");
		}else
			System.out.println("달라");
		
		//다른 주소를 갖고 있는 객체의 물리적 논리적 비교
		if(stuLee2==stuSang) {
			System.out.println("주소가 같습니다.");
		}else
			System.out.println("주소가 다릅니다.");
		
		if(stuLee2.equals(stuSang)) {
			System.out.println("같다");
		}else
			System.out.println("달라");
		
		//인스턴스 생성시 만들어지는 heap메모리 주소
		//Student.java에서 ID값으로 return하도록 재정의함
		System.out.println("stuLee의 hashcode 값 : " + stuLee.hashCode());
		System.out.println("stuLee2의 hashcode 값 : " + stuLee2.hashCode());

		System.out.println("stuLee의 실제주소 값 : " + System.identityHashCode(stuLee));
		System.out.println("stuSang의 실제주소 값 : " + System.identityHashCode(stuSang));
	}
}

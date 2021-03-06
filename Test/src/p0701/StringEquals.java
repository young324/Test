package p0701;

public class StringEquals {
	public static void main(String[] args) {
		//인스턴스는 각각의 heap메모리에 저장됨
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);//인스턴스 주소값(heap)이 다름
		//String 클래스의 equals 메소드가 재정의 되어 논리적 값이 같음을 구현
		System.out.println(str1.equals(str2));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
	}
}
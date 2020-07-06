package p0702;

public class StringTest2 {

	public static void main(String[] args) {
		String javastr = new String("JAVA");
		String androidstr = new String("android");
		
		System.out.println(androidstr.concat(javastr));
		System.out.println("처음 문자열 주소 값 " + System.identityHashCode(javastr));
		
		
	}
}
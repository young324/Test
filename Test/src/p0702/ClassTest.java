package p0702;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//객체를 생성해서 클래스이름을 획득
		Person person = new Person();
		//Object의 getClass()메소드를 사용
		Class pClass=person.getClass();//객체를 통해서 받는방법
		System.out.println(pClass.getName());
		
		//클래스로 접근해서 클래스 이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("p0702.Person");//없을 수도 있어서 예외처리 해줘야함
		System.out.println(pClass3.getName());
		
	}
}
package p0702;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass=Class.forName("p0702.Person");
		System.out.println(pClass);
		
	}
}
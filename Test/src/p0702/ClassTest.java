package p0702;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ü�� �����ؼ� Ŭ�����̸��� ȹ��
		Person person = new Person();
		//Object�� getClass()�޼ҵ带 ���
		Class pClass=person.getClass();//��ü�� ���ؼ� �޴¹��
		System.out.println(pClass.getName());
		
		//Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("p0702.Person");//���� ���� �־ ����ó�� �������
		System.out.println(pClass3.getName());
		
	}
}
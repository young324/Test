package p0701;

public class EqualTest {
	public static void main(String[] args) {
		Student stuLee = new Student(100,"�̻���");
		Student stuLee2 = stuLee;
		Student stuSang = new Student(100,"�̻��");
	
		if(stuLee==stuLee2) {
			System.out.println("�ּҰ� �����ϴ�.");
		}else
			System.out.println("�ּҰ� �ٸ��ϴ�.");
		
		if(stuLee.equals(stuLee2)) {
			System.out.println("����");
		}else
			System.out.println("�޶�");
		
		//�ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		if(stuLee2==stuSang) {
			System.out.println("�ּҰ� �����ϴ�.");
		}else
			System.out.println("�ּҰ� �ٸ��ϴ�.");
		
		if(stuLee2.equals(stuSang)) {
			System.out.println("����");
		}else
			System.out.println("�޶�");
		
		//�ν��Ͻ� ������ ��������� heap�޸� �ּ�
		//Student.java���� ID������ return�ϵ��� ��������
		System.out.println("stuLee�� hashcode �� : " + stuLee.hashCode());
		System.out.println("stuLee2�� hashcode �� : " + stuLee2.hashCode());

		System.out.println("stuLee�� �����ּ� �� : " + System.identityHashCode(stuLee));
		System.out.println("stuSang�� �����ּ� �� : " + System.identityHashCode(stuSang));
	}
}
